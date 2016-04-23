package org.sriramp.javabrains.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.sriramp.javabrains.messenger.model.ErrorMessage;



@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage().toString(), 404, "http://test"); 
		// TODO Auto-generated method stub
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}

}
