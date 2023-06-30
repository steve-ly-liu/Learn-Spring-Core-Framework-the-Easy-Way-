package org.company.config;

import javax.sql.DataSource;

import org.company.DBManager;
import org.company.DataSourceMySQLImpl;
import org.company.standardConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("development")
@Configuration
public class JavaConfigDev implements standardConfig {
 
    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSourceMySQLImpl();
        
        return dataSource;
    }
    
	@Bean
	public DBManager dbManager(DataSource dataSource) {
		return new DBManager(dataSource);
	}
 
}
