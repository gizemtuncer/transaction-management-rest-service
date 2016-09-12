package com.gizemtuncer.database;

import java.util.List;

import com.gizemtuncer.model.Transaction;

public class DatabaseClass {

	private static List<Transaction> transactions = null;

	public static List<Transaction> getTransactions() {
		return transactions;
	}
}
