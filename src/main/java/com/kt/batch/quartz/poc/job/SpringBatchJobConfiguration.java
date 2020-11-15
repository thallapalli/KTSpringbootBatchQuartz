package com.kt.batch.quartz.poc.job;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kt.batch.quartz.poc.reader.CustomItemReader;
import com.kt.batch.quartz.poc.writer.CustomItemWriter;

@Configuration

public class SpringBatchJobConfiguration {
	@Autowired
	 public JobBuilderFactory jobBuilderFactory;
	 
	 @Autowired
	 public StepBuilderFactory stepBuilderFactory;
	 
	 @Bean
	 public CustomItemReader reader() {
	  return new CustomItemReader();
	 }
	 
	 @Bean
	 public CustomItemWriter writer() {
	  return new CustomItemWriter();
	 }
	 
	 @Bean
	  public Step step1() {
	    return stepBuilderFactory.get("step1")
	      .chunk(10)
	      .reader(reader())
	      .writer(writer())
	      .build();
	  }

	  @Bean
	  public Job job() {
	    return jobBuilderFactory.get("job")
	      .start(step1())
	      .build();
	  }

}
