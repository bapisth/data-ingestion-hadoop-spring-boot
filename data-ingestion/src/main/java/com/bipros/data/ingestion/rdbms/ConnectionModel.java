package com.bipros.data.ingestion.rdbms;

import com.bipros.data.ingestion.common.DATABASETYPE;

public class ConnectionModel {
	private String databaseName;
	private String connectionUrl;
	private DATABASETYPE databaseType;
	private String databaseUsername;
	private String databasePassword;
	private String tableName;
	
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getConnectionUrl() {
		return connectionUrl;
	}
	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}
	public String getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
	public String getDatabaseUsername() {
		return databaseUsername;
	}
	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}
	public DATABASETYPE getDatabaseType() {
		return databaseType;
	}
	public void setDatabaseType(DATABASETYPE databaseType) {
		this.databaseType = databaseType;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
