package com.gizemtuncer.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.gizemtuncer.model.ErrorMessage;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

	@Override
	public Response toResponse(NotFoundException ex) {
		ErrorMessage message = new ErrorMessage(ex.getMessage(), 404);
		return Response.status(Status.NOT_FOUND).entity(message).build();
	}

}
