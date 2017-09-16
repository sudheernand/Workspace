package com.indus.training.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld {
	static final Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Hello World!");

}
}