package com.xu.drools.bean;

import lombok.Data;

import java.util.List;

/**
 * Created by xuchun on 2017/7/5.
 */
@Data
public class TradeRequest {
	Double totolFee;
	Double add_fee;
	String postBis;
	Integer num;
	List<WuItem> items;
}
