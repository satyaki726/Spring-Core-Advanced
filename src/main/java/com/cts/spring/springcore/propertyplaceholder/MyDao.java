package com.cts.spring.springcore.propertyplaceholder;

public class MyDao {
	String dbUrl;

	public MyDao(String dbUrl) {

		this.dbUrl = dbUrl;
	}

	@Override
	public String toString() {
		return "MyDao [dbUrl=" + dbUrl + "]";
	}

}