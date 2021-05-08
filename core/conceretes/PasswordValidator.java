package core.conceretes;

import core.abstracts.IUserValidator;
import entities.concretes.User;

public class PasswordValidator implements IUserValidator {

	@Override
	public boolean validate(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println("Parolanýz en az 6 karakterden oluþmak zorundadýr.");
			return false;
		} else {
			System.out.println("Parola uygun girildi");
			return true;
	}
	}
}
