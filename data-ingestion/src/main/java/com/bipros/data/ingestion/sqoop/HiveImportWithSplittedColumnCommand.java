package com.bipros.data.ingestion.sqoop;

public class HiveImportWithSplittedColumnCommand implements SqoopCommand {

	private SqoopService sqoopService;

	public HiveImportWithSplittedColumnCommand(SqoopService sqoopService) {
		this.sqoopService = sqoopService;
	}

	@Override
	public Object execute() {
		sqoopService.importToHiveWithSplittedColumn();
		return null;
	}


}
