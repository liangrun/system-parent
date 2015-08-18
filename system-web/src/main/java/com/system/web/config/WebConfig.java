package com.system.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@Import({ApplicationConfig.class,ControllerConfig.class})
@EnableScheduling
public class WebConfig extends WebMvcConfigurerAdapter{
	final private static Logger logger = LoggerFactory.getLogger(WebConfig.class);

	@Bean
	public ViewResolver getViewResolver() {
		
		final InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		logger.info("WebConfig ---> getViewResolver");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/bootstrap/**").addResourceLocations("/bootstrap/");
		registry.addResourceHandler("/jquery/**").addResourceLocations("/jquery/");
		registry.addResourceHandler("/staticres/**").addResourceLocations("/staticres/");
		registry.addResourceHandler("/IE8lower/**").addResourceLocations("/IE8lower/");
		registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
		logger.info("WebConfig ---> addResourceHandlers");
	}

}
