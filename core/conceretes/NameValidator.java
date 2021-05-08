package core.conceretes;

import core.abstracts.IUserValidator;
import entities.concretes.User;

public class NameValidator implements IUserValidator{

	@Override
	public boolean validate(User user) {
		if (user.getFirstName().length()>1 && user.getLastName().length() > 1) {
			System.out.println("Kullanici adi ve soyadi uygun girildi");
			return true;
		} else {
			System.out.println("Kullanici adi ve soyadi 2 karakterden büyük olmalidir.");
			return false;
		}
	}

	
}
