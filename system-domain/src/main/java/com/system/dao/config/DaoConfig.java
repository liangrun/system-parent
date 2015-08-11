package com.system.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan
@PropertySource(value={"classpath:dao.properties"})
public class DaoConfig {
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer () {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
