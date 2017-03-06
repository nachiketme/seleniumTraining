package com.seleniumTraining.test;

public class config {

	
	public interface Config {
		final String baseUrl = System.getProperty("baseUrl",
		"http://the-internet.herokuapp.com");
		}
	
	
}
