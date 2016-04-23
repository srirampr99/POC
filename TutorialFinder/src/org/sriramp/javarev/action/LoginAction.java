package org.sriramp.javarev.action;

public class LoginAction {
	
	private String userID;
	private String password;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String execute()
	{
		
		if ( getUserID().equals("userID") && getPassword().equals("password") )
		{
			return "success";
			
		}
		
		return "failure";
	}

}
