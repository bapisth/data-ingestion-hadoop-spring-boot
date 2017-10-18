package com.bipros.data.ingestion.rdbms;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import com.bipros.data.ingestion.common.DATABASETYPE;

@Component
public class RDBMSService {

	private static String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	private static String POSTGRESQL_DRIVER = "org.postgresql.Driver";
	private static String ORACLE_DRIVER = "com.mysql.jdbc.Driver";

	private static String MYSQL_SQL_FETCH_ALL_TABLES = "show tables from %s";
	private static String POSTGRES_SQL_FETCH_ALL_TABLES = "select * from information_schema.tables where table_catalog='%s' and table_schema='public' and table_type='BASE TABLE'";
	private static String ORACLE_SQL_FETCH_ALL_TABLES = "show tables from %s";

	private Connection getConnection(ConnectionModel connectionModel, boolean requiredDatabaseName)
			throws SQLException {
		Connection con = null;

		try {
			String driver = connectionModel.getDatabaseType() == DATABASETYPE.MYSQL ? MYSQL_DRIVER
					: connectionModel.getDatabaseType() == DATABASETYPE.POSTGRESQL ? POSTGRESQL_DRIVER : ORACLE_DRIVER;
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		if (requiredDatabaseName) {
			con = DriverManager.getConnection(
					connectionModel.getConnectionUrl() + "/" + connectionModel.getDatabaseName(),
					connectionModel.getDatabaseUsername(), connectionModel.getDatabasePassword()); // configurable
		} else {
			con = DriverManager.getConnection(connectionModel.getConnectionUrl(), connectionModel.getDatabaseUsername(),
					connectionModel.getDatabasePassword()); // configurable
		}

		return con;
	}

	/**
	 * Fetch all the tables for a specific schema
	 * 
	 * @param connectionModel
	 * @return
	 * @throws SQLException
	 */
	public JSONArray getTablesForConnection(ConnectionModel connectionModel) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		try (Connection connection = getConnection(connectionModel, true);
				Statement statement = connection.createStatement()) {
			String query = connectionModel.getDatabaseType() == DATABASETYPE.MYSQL ? MYSQL_SQL_FETCH_ALL_TABLES
					: connectionModel.getDatabaseType() == DATABASETYPE.POSTGRESQL ? POSTGRES_SQL_FETCH_ALL_TABLES
							: ORACLE_SQL_FETCH_ALL_TABLES;

			String formatedQuery = String.format(query, connectionModel.getDatabaseName());
			ResultSet resultSet = statement.executeQuery(formatedQuery);

			while (resultSet.next()) {
				String tableName = "";
				if (connectionModel.getDatabaseType() == DATABASETYPE.MYSQL)
					tableName = resultSet.getString(1);
				if (connectionModel.getDatabaseType() == DATABASETYPE.POSTGRESQL)
					tableName = resultSet.getString("table_name");
				if (connectionModel.getDatabaseType() == DATABASETYPE.ORACLE)
					tableName = resultSet.getString("table_name");
				jsonArray.add(tableName);
			}
		}

		return jsonArray;
	}

	/**
	 * Fetch all the schemas available for the connection
	 * 
	 * @param connectionModel
	 * @return
	 * @throws SQLException
	 */
	public JSONArray getSchemasForConnection(ConnectionModel connectionModel) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		try (Connection connection = getConnection(connectionModel, false);
				Statement statement = connection.createStatement()) {
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			ResultSet schemas = databaseMetaData.getCatalogs();
			while (schemas.next()) {
				String tableSchema = schemas.getString(1); // "TABLE_SCHEM"
				jsonArray.add(tableSchema);
			}
		}

		return jsonArray;
	}

	/**
	 * Fetched table-columns
	 * 
	 * @param connectionModel
	 * @return
	 * @throws SQLException
	 */
	public JSONArray getTableAndColumnsForConnection(ConnectionModel connectionModel) throws SQLException {
		JSONArray jsonResponseArr = new JSONArray();

		try (Connection connection = getConnection(connectionModel, true);
				Statement statement = connection.createStatement()) {
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			ResultSet resultSet = databaseMetaData.getTables(null, connectionModel.getDatabaseName(), "%", null);
			JSONObject tableColumnMap = null;

			while (resultSet.next()) {
				String tableName = resultSet.getString(3);
				ResultSet columns = databaseMetaData.getColumns(null, connectionModel.getDatabaseName(), tableName,
						null);
				ResultSet primaryKeys = databaseMetaData.getPrimaryKeys(null, connectionModel.getDatabaseName(),
						tableName);
				tableColumnMap = new JSONObject();

				// Iterate all the primary Column Names
				JSONArray primaryColumns = new JSONArray();
				while (primaryKeys.next()) {
					String primaryColumnName = primaryKeys.getString(4);
					primaryColumns.add(primaryColumnName);
				}

				// iterate Columns
				JSONArray columnsArr = new JSONArray();
				while (columns.next()) {

					String columnName = columns.getString(4);
					columnsArr.add(columnName);
					tableColumnMap.put(tableName, columnsArr);
				}
				tableColumnMap.put("primaryColumns", primaryColumns);

				jsonResponseArr.add(tableColumnMap);
			}

		}

		return jsonResponseArr;
	}

}
