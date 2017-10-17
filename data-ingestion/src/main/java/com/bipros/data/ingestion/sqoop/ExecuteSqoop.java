package com.bipros.data.ingestion.sqoop;

import java.util.UUID;

import org.apache.hadoop.conf.Configured;

import com.cloudera.sqoop.SqoopOptions;
import com.cloudera.sqoop.SqoopOptions.IncrementalMode;
import com.cloudera.sqoop.tool.ImportTool;

public class ExecuteSqoop extends Configured {

	private static SqoopOptions SqoopOptions = null;
	private SqoopOptionsData optionsData;
	private static String splitByColumn = "";

	static {
		SqoopOptions = new SqoopOptions();
		SqoopOptions.setHadoopMapRedHome(System.getenv("HADOOP_MAPRED_HOME")); // Fetch Mapreduce Home
	}

	private void init() {
		SqoopOptions.setConnectString(optionsData.getConnectionString() + "/" + optionsData.getDatabaseName());
		SqoopOptions.setUsername(optionsData.getUserName());
		SqoopOptions.setPassword(optionsData.getPassword());
	}

	private int runIt() {
		int res;
		res = new ImportTool().run(SqoopOptions);
		if (res != 0) {
			throw new RuntimeException("Sqoop API Failed - return code : " + Integer.toString(res));
		}
		return res;
	}

	private void TransferringEntireTable(String table) {
		SqoopOptions.setTableName(table);
		
		if(splitByColumn != "") {
			SqoopOptions.setSplitByCol(splitByColumn);
		}
	}

	private void TansferringEntireTableSpecificDir(String table, String directory) {
		TransferringEntireTable(table);
		SqoopOptions.setWarehouseDir(directory);
	}

	private void TansferringEntireTableSpecificDirHiveMerge(String table, String directory) {
		TansferringEntireTableSpecificDir(table, directory);
		SqoopOptions.setHiveImport(true);
	}

	private void TansferringEntireTableSpecificDirHivePartitionMerge(String table, String directory,
			String partitionKey, String partitionValue) {
		TansferringEntireTableSpecificDirHiveMerge(table, directory);
		SqoopOptions.setHivePartitionKey(partitionKey);
		SqoopOptions.setHivePartitionValue(partitionValue);
	}

	private static void TansferringEntireTableWhereClause(String table, String whereClause) {
		// To do
	}

	private void CompressingImportedData(String table, String directory, String compress) {
		TansferringEntireTableSpecificDir(table, directory);
		SqoopOptions.setCompressionCodec(compress);
	}

	private void incrementalImport(String table, String directory, IncrementalMode mode, String checkColumn,
			String lastVale) {
		TansferringEntireTableSpecificDir(table, directory);
		SqoopOptions.setIncrementalMode(mode);
		SqoopOptions.setAppendMode(true);
		SqoopOptions.setIncrementalTestColumn(checkColumn);
		SqoopOptions.setIncrementalLastValue(lastVale);
	}

	private void TransferringEntireTableSpecificDirHive(String table, String directory) {
		TansferringEntireTableSpecificDir(table, directory);
		SqoopOptions.setHiveImport(true);
	}

	private void TransferringEntireTableSpecificDirHivePartition(String table, String directory, String partitionKey,
			String partitionValue) {
		TransferringEntireTableSpecificDirHive(table, directory);
		SqoopOptions.setHivePartitionKey(partitionKey);
		SqoopOptions.setHivePartitionValue(partitionValue);
	}

	/**
	 * Not Yet Implemented
	 * 
	 * @param optionsData
	 * @return
	 */
	public String runSqoopHdfsTool(SqoopOptionsData optionsData) {
		this.optionsData = optionsData;

		// Not yet Implemented
		// setup
		init();

		return "Not Yet Implemented";

	}

	public String runSqoopHiveTool(SqoopOptionsData optionsData) {
		return execute(optionsData);
	}

	/**
	 * Hive --split-by options added, It should be added when there is no primary
	 * key in the table
	 * 
	 * @param optionsData
	 * @param splitByColumn
	 * @return
	 */
	public String runSqoopHiveTool(SqoopOptionsData optionsData, String splitByColumn) {

		if (splitByColumn != null || splitByColumn == "") {
			return null;
		} else {
			ExecuteSqoop.splitByColumn = splitByColumn;
		}
		return execute(optionsData);
	}

	/**
	 * Not Yet Implemented
	 * 
	 * @param optionsData
	 * @return
	 */
	public String runSqoopHiveWithParttionTool(SqoopOptionsData optionsData) {
		this.optionsData = optionsData;
		// setup
		init();

		return null;

	}

	/**
	 * Executes Sqoop commands
	 * @param optionsData
	 * @return
	 */
	private String execute(SqoopOptionsData optionsData) {
		synchronized (ExecuteSqoop.class) {
			this.optionsData = optionsData;
			// initialize
			init();
			// Create Sqoop Options
			TransferringEntireTableSpecificDirHive(optionsData.getTableName(), "result/data/" + UUID.randomUUID().toString());
			// Runt the Sqoop Command using above built-in options
			int runIt = runIt();
			return runIt == 0 ? "success" : "failure";
		}
	}

}
