package org.company.config;

import org.company.AnotherBean;
import org.company.OneMoreBean;
import org.company.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
		
	@Bean
	public AnotherBean anotherBean() {

		return new AnotherBean();
	}
	
	@Bean
	public OneMoreBean oneMoreBean() {

		return new OneMoreBean();
	}
	
	@Bean
	public SampleBean sampleBean(AnotherBean anotherBean,OneMoreBean oneMoreBean) {

		return new SampleBean(anotherBean,oneMoreBean);
	}


}
