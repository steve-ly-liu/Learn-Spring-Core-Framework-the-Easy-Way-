package org.company;

import org.springframework.beans.factory.annotation.Autowired;

public class SampleBean {

	
	private AnotherBean anotherBean;

	private OneMoreBean oneMoreBean;


	public SampleBean() {
	}

	public SampleBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	
	@Autowired
	public SampleBean(AnotherBean anotherBean, OneMoreBean oneMoreBean) {
		this.anotherBean = anotherBean;
		this.oneMoreBean = oneMoreBean;
	}

	public void sampleMethod() {
		anotherBean.printMessage();
		oneMoreBean.printMessage();
	}

}
