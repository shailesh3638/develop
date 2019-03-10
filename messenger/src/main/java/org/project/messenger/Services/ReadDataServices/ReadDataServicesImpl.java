package org.project.messenger.Services.ReadDataServices;

import javax.ws.rs.Path;

import org.project.messenger.Models.User;
@Path("/getuser")
public class ReadDataServicesImpl implements ReadDataServices{
public User getUser(){
	User user=new User();
	user.setId(1);
	user.setName("Shailesh");
	user.setUserName("shailesh123");
	return user;}
}	

