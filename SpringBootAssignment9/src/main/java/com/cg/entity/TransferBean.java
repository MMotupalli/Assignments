package com.cg.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class TransferBean {
	
	@NotNull(message="To Account Id is mandatory")
	private Integer formAccountId;
	
	@NotNull(message="Form Account ID is mandatory")
	private Integer toAccountId;
	
	@NotNull(message="Amount is mandatory")
	@Min(value=1000,message="Can transfer minimun Rs.1000")
	@Max(value=50000,message="Can transfer maximum Rs.50000")
	private Double amt;

	public Integer getFormAccountId() {
		return formAccountId;
	}

	public void setFormAccountId(Integer formAccountId) {
		this.formAccountId = formAccountId;
	}

	public Integer getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(Integer toAccountId) {
		this.toAccountId = toAccountId;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	
}
