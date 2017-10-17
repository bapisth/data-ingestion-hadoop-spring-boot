package com.bipros.data.ingestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.bipros.data.ingestion")
public class DataIngestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataIngestionApplication.class, args);
	}
}
