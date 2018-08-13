package com.xu.drools.entity;

/**
 * @author chunchun.xu on 2018/8/13.
 * @version 1.0
 * @descripte
 */
public class Operation {
	public Boolean isOperation;

	public Boolean getOperation() {
		return isOperation;
	}

	public void setOperation(Boolean operation) {
		isOperation = operation;
	}

	@Override
	public String toString() {
		return "Operation{" +
				"isOperation=" + isOperation +
				'}';
	}
}
