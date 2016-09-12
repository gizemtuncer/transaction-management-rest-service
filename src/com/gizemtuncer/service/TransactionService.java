package com.gizemtuncer.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.NotFoundException;

import com.gizemtuncer.database.DatabaseClass;
import com.gizemtuncer.model.Transaction;

public class TransactionService {

	private static List<Transaction> transactions = DatabaseClass.getTransactions();

	public TransactionService() {

	}

	public List<Transaction> getAllTransactions() {
		if (transactions.isEmpty())
			throw new NotFoundException("There is no transaction");
		return new ArrayList<Transaction>(transactions);
	}

	public Transaction getTransaction(long id) {
		return transactions.stream().filter(item -> item.getTransactionId() == id).findFirst().get();
	}

	public String getTransactionIdsByType(String type) {
		String result = null;
		for (Transaction transaction : transactions) {
			String transactionType = transaction.getType();
			if (transactionType.equals(type)) {
				if (result == null)
					result = "[" + transaction.getTransactionId();
				else
					result = result + "," + transaction.getTransactionId();
			}
		}
		result = result + "]";
		return result;
	}

	public double getTransactionAmountSum(long parentId) {
		if (transactions.isEmpty())
			throw new NotFoundException("There is no transaction");

		double sum = 0;
		sum = transactions.stream().filter(item -> item.getParentId() == parentId).mapToDouble(i -> i.getAmount()).sum();
		return sum;
	}

	public String addOrUpdateTransaction(Transaction transaction) {
		if (transaction.getTransactionId() <= 0 || transaction == null)
			throw new NotFoundException("status: Error");

		if(transactions == null || transactions.isEmpty())
			transactions = new ArrayList<Transaction>();
		transactions.add(transaction);
		return "status: OK";
	}

}
