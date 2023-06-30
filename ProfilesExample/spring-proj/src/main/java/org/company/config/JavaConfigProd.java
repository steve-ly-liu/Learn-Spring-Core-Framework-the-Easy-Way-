package org.company.config;

import javax.sql.DataSource;

import org.company.DBManager;
import org.company.DataSourcePostgresqlImpl;
import org.company.standardConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({ "production", "default" })
@Configuration
public class JavaConfigProd implements standardConfig {

	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSourcePostgresqlImpl();

		return dataSource;
	}

	@Bean
	public DBManager dbManager(DataSource dataSource) {
		return new DBManager(dataSource);
	}

}
