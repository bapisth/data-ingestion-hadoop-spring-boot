package com.bipros.data.ingestion.endpoint;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bipros.data.ingestion.sqoop.HdfsImportCommand;
import com.bipros.data.ingestion.sqoop.HiveImportCommand;
import com.bipros.data.ingestion.sqoop.HiveImportWithPartitionCommand;
import com.bipros.data.ingestion.sqoop.SqoopCommandExecutor;
import com.bipros.data.ingestion.sqoop.SqoopOptionsData;
import com.bipros.data.ingestion.sqoop.SqoopService;

@RestController
@RequestMapping("/import")
@CrossOrigin
public class ImportDataFromRDBMSController {

	@Autowired
	private SqoopCommandExecutor commandExecutor;

	// commands
	private HdfsImportCommand hdfsImportCommand;
	private HiveImportCommand hiveImportCommand;
	private HiveImportWithPartitionCommand hiveImportWithPartiionCommand;

	// other datas
	boolean hiveImport = false;
	boolean hiveImportWithPartition = false;

	@PostMapping(value = "/to-hdfs")
	public String importDataFromRDBMSToHDFS(@RequestBody SqoopOptionsData sqoopOptionsData) {

		// Set the data to SqoopService
		SqoopService sqoopService = new SqoopService(sqoopOptionsData);

		// Start Execution
		hdfsImportCommand = new HdfsImportCommand(sqoopService);
		commandExecutor.setSqoopCommand(hdfsImportCommand);
		Object hdfsImportResult = commandExecutor.startExecution();

		return "Hello";
	}

	@PostMapping(value = "/to-hive")
	public JSONObject importDataFromRDBMSToHive(@RequestBody SqoopOptionsData sqoopOptionsData) {
		
		JSONObject responseObject = new JSONObject();

		// Set the data to SqoopService
		SqoopService sqoopService = new SqoopService(sqoopOptionsData);

		// Start Execution
		hiveImportCommand = new HiveImportCommand(sqoopService);
		commandExecutor.setSqoopCommand(hiveImportCommand);
		Object hdfsImportResult = commandExecutor.startExecution();
		
		responseObject.put("response", String.valueOf(hdfsImportResult));

		return responseObject;
				
	}

	@PostMapping(value = "/to-hive-with-partition")
	public String importDataFromRDBMSToHiveWithParttion(@RequestBody SqoopOptionsData sqoopOptionsData) {

		// Set the data to SqoopService
		SqoopService sqoopService = new SqoopService(sqoopOptionsData);

		// Start Execution
		hiveImportWithPartiionCommand = new HiveImportWithPartitionCommand(sqoopService);
		commandExecutor.setSqoopCommand(hiveImportWithPartiionCommand);
		Object hdfsImportResult = commandExecutor.startExecution();

		return "Hello";
	}

}
