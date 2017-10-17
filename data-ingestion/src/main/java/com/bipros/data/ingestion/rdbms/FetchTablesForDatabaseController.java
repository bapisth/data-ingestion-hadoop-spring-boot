package com.bipros.data.ingestion.rdbms;

import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fetch")
@CrossOrigin
public class FetchTablesForDatabaseController {

	@Autowired
	private RDBMSService rdbmsService;

	@PostMapping("/all-tables")
	public JSONArray getAllTables(@RequestBody ConnectionModel connectionModel) throws SQLException {
		JSONArray tables = rdbmsService.getTablesForConnection(connectionModel);
		return tables;
	}
}
