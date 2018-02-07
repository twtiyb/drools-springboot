package com.xu.drools.bean;

import java.io.Serializable;

public class WuItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer qty;

    private String name;

    private String desc;



    public WuItem() {
    }

    public WuItem(Integer qty, String name, String desc) {
        this.qty = qty;
        this.name = name;
        this.desc = desc;
    }

    public Integer getqty() {
        return qty;
    }

    public void setqty(Integer qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
