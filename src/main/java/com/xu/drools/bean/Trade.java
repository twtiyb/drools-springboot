package com.xu.drools.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by xuchun on 2017/7/5.
 */
@ToString
@Data
public class Trade {
	String tradeId;
	String sellerId;
	Double totalFee;
	String postBis;
	Boolean effect = false;
	List<WuItem> items;
	public static int checkQty(List<WuItem> sitems, List<WuItem> initems) {
		int qty = 0;
		for (WuItem wu : sitems) {
			for (WuItem wuin : initems) {
				if (wu.getName().equals(wuin.getName())) {
					qty = qty + wu.getqty();
				}
			}
		}

		return qty;
	}

}
