package com.gizemtuncer.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.gizemtuncer.service.TransactionService;

@Path("/sum")
public class SumResource {
	TransactionService transactionService = new TransactionService();

	@GET
	@Path("/{transactionId}")
	public String getTransactionIdsByType(@PathParam("transactionId") long id) {
		return "{ sum : " + transactionService.getTransactionAmountSum(id) + " }";
	}
}
