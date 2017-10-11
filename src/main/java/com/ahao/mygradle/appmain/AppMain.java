package com.ahao.mygradle.appmain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ahao.mygradle.util.PropertyConfigUtil;

public class AppMain {
	static Logger logger = LoggerFactory.getLogger(AppMain.class);
	static PropertyConfigUtil propertyConfigUtil = 
			PropertyConfigUtil.getInstance("properties/config.properties");
	
	public static void main(String[] args) {
		String confStr = propertyConfigUtil.getValue("myconf");
		logger.info("--****Hi, i'm config string, my value is {}", confStr);
		for (int i = 0; i < 10; i++) {
			logger.info("--****Hi, i'm {}, is that surprise?", i);
		}
	}
}
