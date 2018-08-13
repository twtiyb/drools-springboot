package com.xu.drools.entity;

/**
 * @author chunchun.xu on 2018/8/13.
 * @version 1.0
 * @descripte
 */
public class Item {
	String location;
	String batch;

	public Item(String location, String batch) {
		this.location = location;
		this.batch = batch;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}
}
