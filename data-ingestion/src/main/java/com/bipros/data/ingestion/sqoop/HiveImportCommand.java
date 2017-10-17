package com.bipros.data.ingestion.sqoop;

public class HiveImportCommand implements SqoopCommand {

	private SqoopService sqoopService;

	public HiveImportCommand(SqoopService sqoopService) {
		this.sqoopService = sqoopService;
	}

	@Override
	public Object execute() {
		String importToHive = sqoopService.importToHive();
		return importToHive;
	}

}
