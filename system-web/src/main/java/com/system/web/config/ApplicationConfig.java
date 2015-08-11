package com.system.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.system.dao.config.DaoConfig;
import com.system.dao.config.HibernateConfig;
import com.system.service.config.ServiceConfig;

@Configuration
@Import({HibernateConfig.class ,DaoConfig.class,ServiceConfig.class})
public class ApplicationConfig {

}
