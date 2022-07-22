package com.cts.spring.springcoreadvanced.stereotypes.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	
	@Value("PAT")
	String title;
	@Value("CTS")
	String company;
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}
}
