package com.tutorialspoint;  

import java.util.List; 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/UserService") 

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<User> getUsers(){ 
      return userDao.getAllUsers(); 
   }  
   @POST 
   @Path("/test") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<User> getdata(){ 
      return userDao.getAllUsers(); 
   }  
}