package com.system.dao.config;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value= {"classpath:persistence.hibernate.properties", "classpath:domain.properties"})
@EnableTransactionManagement
public class HibernateConfig {
	
	@Autowired
	private Environment env;
	
	@Value("#{'${com.system.domain.entity}'.split(',')}")
	private List<String> packageList;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public LocalSessionFactoryBean sessionFactoryBean() {
		final LocalSessionFactoryBean ret = new LocalSessionFactoryBean();
		ret.setHibernateProperties(hiberateProperties());
		ret.setPackagesToScan(packageList.toArray(new String[0]));
		return ret;
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public HibernateTransactionManager transactionManager(final LocalSessionFactoryBean localSessionFactoryBean)
	{
		final HibernateTransactionManager ret = new HibernateTransactionManager();
		ret.setSessionFactory(localSessionFactoryBean.getObject());
		return ret;
	}
	private Properties hiberateProperties() {
		return new Properties()
		{
			private static final long serialVersionUID = -5628445372599791324L;
			{
				setProperty("hibernate.connection.url", env.getProperty("com.system.domain.connection.url"));
				setProperty("hibernate.connection.username", env.getProperty("com.system.domain.connection.username"));
				setProperty("hibernate.connection.password", env.getProperty("com.system.domain.connection.password"));
				
				setProperty("hibernate.connection.driver_class", env.getProperty("com.system.persistence.hibernate.connection.driver_class"));
				setProperty("hibernate.connection.provider_class", env.getProperty("com.system.persistence.hibernate.connection.provider_class"));
				setProperty("hibernate.c3p0.acquire_increment", env.getProperty("com.system.persistence.hibernate.connection.hibernate.cp30.acquire_increment"));
				setProperty("hibernate.c3p0.idle_test_period", env.getProperty("com.system.persistence.hibernate.connection.hibernate.cp30.idle_test_period"));
				setProperty("hibernate.c3p0.max_size", env.getProperty("com.system.persistence.hibernate.connection.hibernate.cp30.max_size"));
				setProperty("hibernate.c3p0.max_statements", env.getProperty("com.system.persistence.hibernate.connection.hibernate.cp30.max_statements"));
				setProperty("hibernate.c3p0.min_size", env.getProperty("com.system.persistence.hibernate.connection.hibernate.cp30.min_size"));
				setProperty("hibernate.c3p0.timeout", env.getProperty("com.system.persistence.hibernate.connection.hibernate.cp30.timeout"));	
				setProperty("hibernate.dialect",env.getProperty("com.system.persistence.hibernate.dialect"));	
				setProperty("hibernate.hbm2ddl.auto",env.getProperty("com.system.persistence.hibernate.hbm2ddl.auto"));
			}
		};
	}
	

}
