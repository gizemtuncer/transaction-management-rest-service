package com.gizemtuncer.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gizemtuncer.service.TransactionService;

@Path("/types")
public class TypeResource {
	TransactionService transactionService = new TransactionService();

	@GET
	@Path("/{type}")
	@Produces(MediaType.APPLICATION_JSON)
	public String  getTransactionIdsByType(@PathParam("type") String type) {
		return transactionService.getTransactionIdsByType(type);
	}
}
