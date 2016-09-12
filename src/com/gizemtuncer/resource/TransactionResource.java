package com.gizemtuncer.resource;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gizemtuncer.model.Transaction;
import com.gizemtuncer.service.TransactionService;

@Path("/transactions")
public class TransactionResource {

	TransactionService transactionService = new TransactionService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Transaction> getTransaction() {
		return transactionService.getAllTransactions();
	}

	@GET
	@Path("/{transactionId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Transaction getTransactionById(@PathParam("transactionId") long Id) {
		return transactionService.getTransaction(Id);
	}

	@PUT
	@Path("/{transactionId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addTransaction(@PathParam("transactionId") long Id, Transaction transaction) {
		transaction.setTransactionId(Id);
		return transactionService.addOrUpdateTransaction(transaction);
	}

}
