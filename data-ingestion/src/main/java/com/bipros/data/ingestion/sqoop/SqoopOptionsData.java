package com.bipros.data.ingestion.sqoop;

public class SqoopOptionsData {
	private String connectionString;
	private String userName;
	private String password;
	private String databaseName;
	private String tableName;
	private boolean hiveImport = false;
	private boolean hiveImportWithPartition = false;
	private String splitByColumn;
	private String lastSplittedColumnValue;

	private SqoopOptionsData() {
	}

	public SqoopOptionsData(Builder builder) {
		this.connectionString = builder.connectionString;
		this.userName = builder.userName;
		this.password = builder.password;
		this.hiveImport = builder.hiveImport;
		this.hiveImportWithPartition = builder.hiveImportWithPartition;
		this.splitByColumn = builder.splitByColumn;
		this.lastSplittedColumnValue = builder.lastValueOfSplittedColumn;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public String getTableName() {
		return tableName;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public boolean isHiveImport() {
		return hiveImport;
	}

	public boolean isHiveImportWithPartition() {
		return hiveImportWithPartition;
	}

	public String getSplitByColumn() {
		return splitByColumn;
	}

	public String getLastSplittedColumnValue() {
		return lastSplittedColumnValue;
	}

	public static class Builder {
		private String connectionString;
		private String userName;
		private String password;
		private String databaseName;
		private String tableName;
		private String databaseType;
		private boolean hiveImport = false;
		private boolean hiveImportWithPartition = false;
		private String splitByColumn;
		private String lastValueOfSplittedColumn;

		public Builder setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
			return this;
		}

		public Builder setTableName(String tableName) {
			this.tableName = tableName;
			return this;
		}

		public Builder setConnectionString(String connectionString) {
			this.connectionString = connectionString;
			return this;
		}

		public Builder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setHiveImport(boolean hiveImport) {
			this.hiveImport = hiveImport;
			return this;
		}

		public Builder setHiveImportWithPartition(boolean hiveImportWithPartition) {
			this.hiveImportWithPartition = hiveImportWithPartition;
			return this;
		}

		public Builder setDatabaseType(String databaseType) {
			this.databaseType = databaseType;
			return this;
		}

		public Builder setSplitByColumn(String splitByColumn) {
			this.splitByColumn = splitByColumn;
			return this;
		}

		public Builder setLastSplittedColumnValue(String lastValueOfSplittedColumn) {
			this.lastValueOfSplittedColumn = lastValueOfSplittedColumn;
			return this;
		}

		public SqoopOptionsData build() {
			return new SqoopOptionsData(this);
		}

	}

}
