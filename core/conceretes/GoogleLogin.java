package core.conceretes;

import GoogleLogin.LoginWithGoogle;
import core.abstracts.ILogýnWithDifferentService;

public class GoogleLogin implements ILogýnWithDifferentService {

	@Override
	public void loginWith(String message) {
		LoginWithGoogle loginWithGoogle = new LoginWithGoogle();
		loginWithGoogle.googleLogin(message);
		
	}

}
