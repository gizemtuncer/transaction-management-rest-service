package com.gizemtuncer.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import com.gizemtuncer.model.ErrorMessage;

@Provider
public class GenericExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500);

		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

}
