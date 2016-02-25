package com.cnfwsy.app.day06.javaservice;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.apache.log4j.Logger;

public class ServiceTask4 implements JavaDelegate {
	private final Logger log = Logger.getLogger(ServiceTask4.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Thread.sleep(10000);
		log.info("variavles=" + execution.getVariables());
		execution.setVariable("task4", "I am task 4");
		log.info("I am task 4.");

	}

}
