package com.bipros.data.ingestion.rdbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
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

	private Connection getConnection(ConnectionModel connectionModel) throws SQLException {

		try {
			String driver = connectionModel.getDatabaseType() == DATABASETYPE.MYSQL ? MYSQL_DRIVER
					: connectionModel.getDatabaseType() == DATABASETYPE.POSTGRESQL ? POSTGRESQL_DRIVER : ORACLE_DRIVER;
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		Connection con = DriverManager.getConnection(connectionModel.getConnectionUrl()+"/"+ connectionModel.getDatabaseName(),
				connectionModel.getDatabaseUsername(), connectionModel.getDatabasePassword()); // configurable
		return con;
	}

	public JSONArray getTablesForConnection(ConnectionModel connectionModel) throws SQLException {
		JSONArray jsonArray = new JSONArray();
		try (Connection connection = getConnection(connectionModel);
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

}
