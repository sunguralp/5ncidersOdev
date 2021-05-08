import business.concretes.UserManager;
import core.abstracts.IUserValidator;
import core.conceretes.BlankValidator;
import core.conceretes.EmailValidator;
import core.conceretes.NameValidator;
import core.conceretes.PasswordValidator;
import core.conceretes.SameMailValidator;
import dataAccess.concretes.DatabaseUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Hakan");
		user1.setLastName("Sungur");
		user1.seteMail("hakansungur@gmail.com");
		user1.setPassword("123456");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Deniz");
		user2.setLastName("Sungur");
		user2.seteMail("denizsungur@gmail.com");
		user2.setPassword("123456");
		
		DatabaseUserDao dbUserDao = new DatabaseUserDao();
		dbUserDao.add(user1);
		

		
		IUserValidator[] validators = {new BlankValidator(), new NameValidator(), new PasswordValidator()};
		
		PasswordValidator passwordValidator = new PasswordValidator();
		EmailValidator eMailValidator = new EmailValidator();
		NameValidator nameValidator = new NameValidator();
		BlankValidator blankValidator = new BlankValidator();
		SameMailValidator sameMailValidator = new SameMailValidator();
	    blankValidator.validate(user1);
		passwordValidator.validate(user1);
		eMailValidator.validate(user1);
		nameValidator.validate(user1);
		sameMailValidator.validate(user1);
		
		

		UserManager manager = new UserManager();
		manager.register(user1, blankValidator, eMailValidator, nameValidator, passwordValidator);
		manager.isMailVerificate(user1);

		manager.googleLogin(null);
		
		manager.login("hakansungur@gmail.com", "123456", user1);
		

	

	}

}
