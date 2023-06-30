package org.company;

import org.springframework.beans.factory.DisposableBean;

public class PrototypeDestroy implements DisposableBean {
	public PrototypeDestroy() {}

	public void init() {
		System.out.println("PrototypeDestroy : Init called ...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("PrototypeDestroy : Destroy called ...");
	}
}