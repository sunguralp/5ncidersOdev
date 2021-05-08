package business.concretes;

import business.abstracts.IUserManager;
import core.conceretes.BlankValidator;
import core.conceretes.EmailValidator;
import core.conceretes.GoogleLogin;
import core.conceretes.NameValidator;
import core.conceretes.PasswordValidator;
import entities.concretes.User;

public class UserManager implements IUserManager{

	@Override
	public void register(User user, BlankValidator blankValidator, EmailValidator eMailValidator,
			NameValidator nameValidator, PasswordValidator passwordValidator) {

		if(blankValidator.validate(user) && eMailValidator.validate(user) &&
		  nameValidator.validate(user) && passwordValidator.validate(user)) {
			System.out.println("Kayýt olma iþlemi baþarýlý.");
			sendVerificationCode(user);
		} else {
			System.out.println("Kayýt olma iþlemi baþarýsýz.");
		}
		
	}

	@Override
	public void sendVerificationCode(User user) {
		System.out.println("Dogrulama kodu " + user.geteMail() + " eposta adresinize gönderildi.");
		
	}

	@Override
	public void isMailVerificate(User user) {
		System.out.println(user.geteMail() + " adresiyle mail adresi dogrulandi");
	}

	@Override
	public void googleLogin(GoogleLogin googleLogin) {
		System.out.println("Google ile giris yapildi");
	}

	@Override
	public void login(String eMail, String password, User user) {
		if (eMail == user.geteMail() && password == user.getPassword()) {		
			System.out.println("Giris islemi basarili");
		}
		else {
			System.out.println("Giris islemi basarisiz. Lütfen email ve parolanizi kontrol ediniz.");
		}
		
	}

}
