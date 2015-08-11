package com.system.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages={"com.system"})
@PropertySource(value = {"classpath:dao.properties"})
@Import({TimeTaskConfig.class})
public class ControllerConfig {

	final private static Logger logger = LoggerFactory.getLogger(ControllerConfig.class);
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		logger.info("ControllerConfig --- > placeholderConfigurer");
		return new PropertySourcesPlaceholderConfigurer();
	}


}
