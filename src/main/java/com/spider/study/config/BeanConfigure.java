package com.spider.study.config;

import com.spider.study.SpringPipelineFactory;
import com.spider.study.demo.ConsolePipeline;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigure {

	@Bean
	public SpringPipelineFactory springPipelineFactory() {
		return new SpringPipelineFactory();
	}
	
	@Bean(name="consolePipeline")
	public ConsolePipeline consolePipeline() {
		return new ConsolePipeline();
	}
}
