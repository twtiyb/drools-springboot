package com.xu.drools.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by xuchun on 2017/7/5.
 */
@Data
@Entity
public class TemplateRule {
	String templateId;
	String name;
	String des;
	//这里也可能是以entity形式来的
	String paramJson;
	String returnJson;
	String devRuleName;
}
