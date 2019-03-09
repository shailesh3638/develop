package org.project.messenger.Services.ReadDataServices;

import org.project.messenger.Models.User;

public class ReadDataServicesImpl implements ReadDataServices {

	public User getUser(){
		User user=new User();
		user.setId(1);
		user.setName("Shailesh");
		user.setUserName("shailesh123");
		return user;}
}
