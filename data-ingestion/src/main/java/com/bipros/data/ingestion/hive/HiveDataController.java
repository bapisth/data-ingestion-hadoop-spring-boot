package com.bipros.data.ingestion.hive;

import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hive")
@CrossOrigin
public class HiveDataController {
	
	@GetMapping("/all-tables")
	private Object getDefaultTables() {
		try {
			return HiveDataSourceConnection.getDefaultTableList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/{tableName}")
	private Object getDataForTable(@PathVariable("tableName") String tableName) {
		JSONArray tableRows = HiveDataSourceConnection.getData(tableName);
		return tableRows;
	}

}
