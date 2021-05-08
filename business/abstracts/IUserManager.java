package business.abstracts;

import core.conceretes.BlankValidator;
import core.conceretes.EmailValidator;
import core.conceretes.GoogleLogin;
import core.conceretes.NameValidator;
import core.conceretes.PasswordValidator;
import entities.concretes.User;

public interface IUserManager {
	
	void register(User user, BlankValidator blankValidator, EmailValidator eMailValidator, NameValidator nameValidator, PasswordValidator passwordValidator);
	void sendVerificationCode(User user);
	void isMailVerificate(User user);
	void googleLogin(GoogleLogin googleLogin);
	void login(String eMail, String password, User user);

}
