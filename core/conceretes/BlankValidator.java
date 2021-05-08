package core.conceretes;

import core.abstracts.IUserValidator;
import entities.concretes.User;

public class BlankValidator implements IUserValidator {

	@Override
	public boolean validate(User user) {
		if (!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
				!user.geteMail().isEmpty() && !user.getPassword().isEmpty()) {
			System.out.println("Kullan�c� bilgileri eksiksiz olarak girildi.");
			return true;
		} else {
			System.out.println("L�tfen t�m zorunlu alanlar� eksiksiz doldurunuz.");
			return false;
		}
	}

}
