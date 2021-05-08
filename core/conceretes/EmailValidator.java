package core.conceretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.IUserValidator;
import entities.concretes.User;

public class EmailValidator implements IUserValidator {
	String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
	@Override
	public boolean validate(User user) {
		
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(matcher.matches()) {
			System.out.println("Mail doðru girildi.");
			return true;
		} else {
			System.out.println("Lütfen mail adresinizi kontrol ediniz. Kurallara uygun giriþ yapýnýz.");
			return false;
		}
	
	}

}
