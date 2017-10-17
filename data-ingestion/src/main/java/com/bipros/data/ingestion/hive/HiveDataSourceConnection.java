package com.bipros.data.ingestion.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class HiveDataSourceConnection {
	// private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";
	private static final String DRIVER_NAME = "org.apache.hive.jdbc.HiveDriver";
	private static final String CONNECTION_URL = "jdbc:hive2://localhost:10000/default";
	private static final String USERNAME = "APP";
	private static final String PASSWORD = "mine";
	private static final String SQL_SHOW_TABLES = "show tables";

	private static Connection getConnection() throws SQLException {

		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);// user id // configurable
		return con;
	}

	public static long count(String tableName) throws SQLException {
		String count = "";
		try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
			// regular hive query
			String sql = "select count(1) from " + tableName;
			ResultSet res = statement.executeQuery(sql);

			while (res.next()) {
				count = res.getString(1);
			}

		}
		return Long.parseLong(count);
	}

	@SuppressWarnings("unchecked")
	public static JSONArray getData(String tableName) {
		try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {

			JSONArray jsonArray = new JSONArray();
			// select * query and fetch only 5 records
			String sql = "select * from " + tableName + " limit 5";
			ResultSet res = statement.executeQuery(sql);

			while (res.next()) {
				ResultSetMetaData metaData = res.getMetaData();
				int columnCount = metaData.getColumnCount();

				JSONObject jsonObject = new JSONObject();
				for (int i = 1; i <= columnCount; i++) {
					String columnName = res.getMetaData().getColumnName(i);
					int indexOf = columnName.indexOf(".");
					String substringColumnName = columnName.substring(indexOf + 1, columnName.length());
					String columnValue = String.valueOf(res.getString(i));

					jsonObject.put(String.valueOf(substringColumnName), columnValue);
				}
				jsonArray.add(jsonObject);

			}
			return jsonArray;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JSONArray getDefaultTableList() throws SQLException {
		JSONArray jsonArray = null;
		try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
			ResultSet resultSet = statement.executeQuery(SQL_SHOW_TABLES);
			jsonArray = new JSONArray();
			while (resultSet.next()) {
				if(resultSet.getString(1).indexOf("kylin_intermediate")<0)
					jsonArray.add(resultSet.getString(1));
			}
		}

		return jsonArray;
	}

	public static void main(String[] args) throws SQLException {
		JSONArray defaultTableList = getDefaultTableList();
		System.out.println(defaultTableList.toJSONString());
	}

}
