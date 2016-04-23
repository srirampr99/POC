package org.sriramp.javabrains.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.sriramp.javabrains.messenger.model.ErrorMessage;



	public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

		@Override
		public Response toResponse(Throwable ex) {
			
			ErrorMessage errorMessage = new ErrorMessage(ex.getMessage().toString(), 500, "http://test"); 
			// TODO Auto-generated method stub
			//return Response.status(Status.INTERNAL_SERVER_ERROR)
				//	.entity(errorMessage)
				//	.build();
			 return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).type("application/json")
		                .build();
			
		}


}
