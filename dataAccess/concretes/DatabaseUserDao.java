package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.IUserDao;
import entities.concretes.User;

public class DatabaseUserDao implements IUserDao{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		for (User user1 : users) {
			System.out.println(user1.getFirstName()+ " " + user1.getLastName()+ " " + "Adli Kullanici sisteme Eklendi..." );
		}
	
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
