package com.nextgen.firstspring.services;



import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nextgen.firstspring.model.Todo;
import com.nextgen.firstspring.model.User;



@Service
public class UserService {

    private static List<User> users = new ArrayList<User>();
    private static int userCount = 3;

    static {
    	    users.add(new User(1 ,"sakibhasan.net@gmail.com","sakib", "MD" , "Hasan" , "+19293276057" , "7200, Merion Terrace, Upper Darby, Pennsylvania 19082"));
    	    users.add(new User(2 , "zerin","zerin","Kazi" , "Tasnim" , "+19293016277" , "7200, Merion Terrace, Upper Darby, Pennsylvania 19082"));
    	    users.add(new User(3 , "sayem","sayem","Kazi" , "Sayem" , "+19293276057" , "3210 Ave H, Brooklyn NY 11210"));

    }

    public void addUser(String user, String password, String firstName, String lastName ,String phone, String address ) {
    		int id = userCount +1;
    		userCount = userCount +1;
    		users.add(new User(id, user, password ,  firstName, lastName, phone , address));
    }
    
    public User getUser(String user , String pass) 
    {
    	System.out.println(" We are here..");
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) 
        {
        
        		User userObj = iterator.next();
        		System.out.println("Checking -> "+user+" with -> "+userObj.getUsername());
        		
        		
            if (userObj.getUsername().equals(user)) 
            {
            	System.out.println(" Found User -> "+user);
            	
            	System.out.println("Checking -> "+pass+" with -> "+userObj.getPassword());
            		if(userObj.getPassword().equals(pass))
            		{
            			System.out.println("Returning -> " + userObj.toString());
                     return userObj;
            		}
            		
            		return null;
            }
        }
        
        System.out.println("Returning null !!!!!");
        return null;
    }
    
    
    public boolean findUser(String user) 
    {
    	System.out.println(" finding user -> "+user);
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) 
        {
        
        		User userObj = iterator.next();
        		System.out.println("Checking -> "+user+" with -> "+userObj.getUsername());
        		
        		
            if (userObj.getUsername().equalsIgnoreCase(user.trim())) 
            {
            		System.out.println(" Found User -> "+user);
            		return true;
           
            }
        }
        
        return false;
    }

}
