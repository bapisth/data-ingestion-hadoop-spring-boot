package com.bipros.data.ingestion.sqoop;

public class HiveImportWithPartitionCommand implements SqoopCommand {

	private SqoopService sqoopService;

	public HiveImportWithPartitionCommand(SqoopService sqoopService) {
		this.sqoopService = sqoopService;
	}

	@Override
	public Object execute() {
		sqoopService.importToHdfs();
		return null;
	}

}
