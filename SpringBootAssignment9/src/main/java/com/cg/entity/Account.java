package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="cg_account")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Account {
	
	@NotNull(message="Account Id is Mandatory")
	@Id
	@Column(name="acc_id")
	private Integer accId;
	
	@NotEmpty(message="Customer name is mandatory")
	@Size(min=3,max=25,message="length can be between 3 to 25 characters")
	@Pattern(regexp="([A-Za-z]+)|([A-Za-z]+[ ][A-Za-z]+)",message="allow only alphabets and a blank space is allowed")
	@Column(name="cust_name",length=25)
	private String custName;
	
	@NotNull(message="Balance is Mandatory")
	@Min(value=1000,message="Your opening amount must be Rs.1000")
	private Double balance;
	
	public Account() {
		
	}

	public Account(int accId,String custName,double balance) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.balance = balance;
	}
	
	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return  accId + " " + custName + " " + balance ;
	}

	
	

}
