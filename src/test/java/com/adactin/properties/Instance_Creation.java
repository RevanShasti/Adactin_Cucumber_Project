package com.adactin.properties;

import java.io.IOException;

public class Instance_Creation {
	
	private Instance_Creation() {
		// TODO Auto-generated constructor stub
	}

	public static Instance_Creation getInstance() {

		Instance_Creation inst = new Instance_Creation();

		return inst;

	}

	public static Configuration_Reader getInstanceCR() throws IOException {

		Configuration_Reader crInst = new Configuration_Reader();
		return crInst;
	}
}