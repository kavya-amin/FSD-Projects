package com.mycompany.spring_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "comm.mycompany.spring_java_config")
public class SportConfig {
	@Bean
	public Coach tennisCoach()
	{
		return new TennisCoach();
	}
	@Bean
	public RandomFortuneService randomFortuneService()
	{
		return new RandomFortuneService();
	}

}
