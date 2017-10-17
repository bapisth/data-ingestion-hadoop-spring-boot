package com.bipros.data.ingestion.sqoop;

public class HdfsImportCommand implements SqoopCommand {

	private SqoopService sqoopService;

	public HdfsImportCommand(SqoopService sqoopService) {
		this.sqoopService = sqoopService;
	}

	@Override
	public Object execute() {
		sqoopService.importToHdfs();
		return null;
	}

}
