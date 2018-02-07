package com.xu.drools.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by xuchun on 2017/7/5.
 */

@Data
@Entity
public class UserRule {
	String ruleId;
	String userId;
	List<UserRuleDetail> detailList;

}
