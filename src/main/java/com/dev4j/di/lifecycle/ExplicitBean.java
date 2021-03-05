package com.dev4j.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplicitBean {
	
	public  static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);
	private void init() {
		log.info("Init Method");
	}
	
	private void destroy() {
		log.info("Destroy Method");
	}	
}
