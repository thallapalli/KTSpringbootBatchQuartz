package com.kt.batch.quartz.poc.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomItemWriter implements ItemWriter<Object>  {

	@Override
	public void write(List<? extends Object> items) throws Exception {
		// TODO Auto-generated method stub
		
		for(Object item:items) {
			System.out.println(item.toString());
		}
		
	}

}
