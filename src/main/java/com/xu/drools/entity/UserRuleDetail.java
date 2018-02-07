package com.xu.drools.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by xuchun on 2017/7/5.
 */
@Data
@Entity
public class UserRuleDetail {
	String ruleId;
	String ruleDetailId;
	TemplateRule rule;
	String paramJson;
}
