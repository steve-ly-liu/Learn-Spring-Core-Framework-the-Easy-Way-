package org.company;

import org.springframework.beans.factory.DisposableBean;

public class ServerConfig implements DisposableBean {

	private PrototypeDestroy pdBean;

	public ServerConfig(PrototypeDestroy prototypeDestory) {
		this.pdBean = prototypeDestory;
	}

	public void init() throws Exception {
		System.out.println("ServerConfig : Init called..");

	}

	public void destroy() throws Exception {
		System.out.println("ServerConfig : Destroy called..");
		this.pdBean.destroy();
	}

}
