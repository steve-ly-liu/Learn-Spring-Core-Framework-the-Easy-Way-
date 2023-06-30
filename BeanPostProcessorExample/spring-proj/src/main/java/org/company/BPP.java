package org.company;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BPP implements BeanPostProcessor {


	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println(beanName + " : Before Init..");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println(beanName + " : After Init..");
		return bean;
	}

}
