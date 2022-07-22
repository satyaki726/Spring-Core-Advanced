package com.cts.spring.springcoreadvanced.autowiring;

public class Department {

	int dId;
	int sId;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", sId=" + sId + "]";
	}
}
