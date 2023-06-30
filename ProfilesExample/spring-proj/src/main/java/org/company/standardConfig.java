package org.company;

import javax.sql.DataSource;

public interface standardConfig {
	DataSource dataSource();
	DBManager dbManager(DataSource dataSource);
}
