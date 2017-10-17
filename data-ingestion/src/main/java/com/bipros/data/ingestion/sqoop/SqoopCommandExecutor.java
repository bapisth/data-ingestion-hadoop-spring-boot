package com.bipros.data.ingestion.sqoop;

import org.springframework.stereotype.Component;

@Component
public class SqoopCommandExecutor {
	private SqoopCommand sqoopCommand;

	public void setSqoopCommand(SqoopCommand sqoopCommand) {
		this.sqoopCommand = sqoopCommand;
	}

	public Object startExecution() {
		return sqoopCommand.execute();
	}

}
