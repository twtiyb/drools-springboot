package com.xu.drools.entity;

import java.util.List;

/**
 * @author chunchun.xu on 2018/8/13.
 * @version 1.0
 * @descripte
 */
public class Container {
	public List<Item> itemList;
	public String identify;

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}
}
