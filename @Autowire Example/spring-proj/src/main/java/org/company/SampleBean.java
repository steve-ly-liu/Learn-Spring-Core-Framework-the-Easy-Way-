package org.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SampleBean {
	
	@Autowired
	@Qualifier("anotherBean")
	private AnotherBean anotherBean;
	
	@Autowired
	private OneMoreBean oneMoreBean;

	public SampleBean() {

	}
	
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	public void setOneMoreBean(OneMoreBean oneMoreBean) {
		this.oneMoreBean = oneMoreBean;
	}

	public void sampleMethod() {
		anotherBean.printMessage();
		oneMoreBean.printMessage();
	}

}
