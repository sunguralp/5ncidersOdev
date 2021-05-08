package core.conceretes;

import java.util.ArrayList;

import core.abstracts.IUserValidator;
import entities.concretes.User;

public class SameMailValidator implements IUserValidator {
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public boolean validate(User user) {
		
		if (!user.geteMail().isEmpty())
			
		return false;
		
		for (User userArray : users) {
			if (userArray.geteMail() == user.geteMail()) {
				System.out.println("Bu email adresi daha önce kullanilmis. Lütfen geçerli bir adres giriniz.");
				return false;
			} 
				System.out.println("Daha önce kullanilmis bir eposta adresi girdiniz. Islem basarili.");
				return true;
		
	}
		return false;
	}
}


