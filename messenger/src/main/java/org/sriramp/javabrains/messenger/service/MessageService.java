package org.sriramp.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.sriramp.javabrains.messenger.database.DatabaseClass;
import org.sriramp.javabrains.messenger.exception.DataNotFoundException;
import org.sriramp.javabrains.messenger.model.ErrorMessage;
import org.sriramp.javabrains.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L, new Message(1, "Hello World", "Sudeeksha"));
		messages.put(2L, new Message(1, "Hello Jersey", "Avaneesh"));

	}

/*	public List<Message> getAllMessages()
	{
		Message m1 = new Message(1L, "Hello World", "Sudeeksha");
		Message m2 = new Message(2L, "Hello Jersey", "Avaneesh");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;

	} */
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values()) ;
	}
	
	public Message getMessage(long id)
	{
		
		ErrorMessage errorMessage = new ErrorMessage("Not found", 500, "http://test");
		Response response = Response.status(Status.NOT_FOUND).entity(errorMessage).type("application/json")
        .build();
		Message message = messages.get(id);
		if( message == null)
		{
			//throw new DataNotFoundException("Message with message id " + id + " not found");
			
			throw new WebApplicationException(response);
			
		}
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;		
	}
	
	public Message updateMessage(Message message)
	{
		if( message.getId() <= 0 ) 
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
}
