package org.company;

public class SampleBean {

	private AnotherBean anotherBean;

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public SampleBean() {
	}

	public SampleBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	public void sampleMethod() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		anotherBean.displayMessage(message);
	}
}
