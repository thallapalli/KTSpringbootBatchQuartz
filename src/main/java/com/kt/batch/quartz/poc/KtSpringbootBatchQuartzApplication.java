package com.kt.batch.quartz.poc;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableBatchProcessing(modular = false)
//@EntityScan("com.kt.batch.quartz.poc.domain")
public class KtSpringbootBatchQuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtSpringbootBatchQuartzApplication.class, args);
	}

}
