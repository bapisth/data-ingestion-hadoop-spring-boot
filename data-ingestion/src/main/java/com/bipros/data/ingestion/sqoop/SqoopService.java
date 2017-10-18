package com.bipros.data.ingestion.sqoop;

public class SqoopService {

	private boolean importCmd;
	private boolean exportCmd;
	private boolean listDatabasesCmd;
	private boolean listAllTablesCmd;
	private SqoopOptionsData sqoopOptionsData;

	public SqoopService(SqoopOptionsData optionsData) {
		this.sqoopOptionsData = optionsData;
	}

	public boolean isImportCmd() {
		return importCmd;
	}

	public void setImportCmd(boolean importCmd) {
		this.importCmd = importCmd;
	}

	public boolean isExportCmd() {
		return exportCmd;
	}

	public void setExportCmd(boolean exportCmd) {
		this.exportCmd = exportCmd;
	}

	public boolean isListDatabasesCmd() {
		return listDatabasesCmd;
	}

	public void setListDatabasesCmd(boolean listDatabasesCmd) {
		this.listDatabasesCmd = listDatabasesCmd;
	}

	public boolean isListAllTablesCmd() {
		return listAllTablesCmd;
	}

	public void setListAllTablesCmd(boolean listAllTablesCmd) {
		this.listAllTablesCmd = listAllTablesCmd;
	}

	public SqoopOptionsData getSqoopOptionsData() {
		return sqoopOptionsData;
	}

	public void setSqoopOptionsData(SqoopOptionsData sqoopOptionsData) {
		this.sqoopOptionsData = sqoopOptionsData;
	}

	// services
	public String importToHdfs() {
		
		return null;
	}

	public String importToHive() {
		ExecuteSqoop executeSqoop = new ExecuteSqoop();
		String runSqoopHiveTool = executeSqoop.runSqoopHiveTool(sqoopOptionsData);
		return runSqoopHiveTool;
	}
	
	public String importToHiveWithSplittedColumn() {
		ExecuteSqoop executeSqoop = new ExecuteSqoop();
		String runSqoopHiveTool = executeSqoop.runSqoopHiveToolWithSplittedColumn(sqoopOptionsData);
		return runSqoopHiveTool;
	}

	public String importToHiveWithPartition() {
		return null;
	}

}
