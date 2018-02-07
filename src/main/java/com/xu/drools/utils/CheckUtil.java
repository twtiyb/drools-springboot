package com.xu.drools.utils;

import com.xu.drools.bean.WuItem;

import java.util.List;

public class CheckUtil {
	public static int checkQty(List<WuItem> sitems, List<WuItem> initems){
		int qty=0;
		for(WuItem wu:sitems){
			for(WuItem wuin:initems){
				if(wu.getName().equals(wuin.getName())){
					qty=qty+wu.getqty();
				}
			}
		}

		return qty;
	}
}
