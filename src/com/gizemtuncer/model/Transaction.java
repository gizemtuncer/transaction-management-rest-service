package com.gizemtuncer.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction {
	private long transactionId;
	private double amount;
	private String type;
	private long parentId;

	public Transaction() {
	}

	public Transaction(long transactionId, double amount, String type) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.type = type;
	}
	
	public Transaction(long transactionId, double amount, String type, long parentId) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.type = type;
		this.parentId = parentId;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
}
