package core.conceretes;

import GoogleLogin.LoginWithGoogle;
import core.abstracts.ILog�nWithDifferentService;

public class GoogleLogin implements ILog�nWithDifferentService {

	@Override
	public void loginWith(String message) {
		LoginWithGoogle loginWithGoogle = new LoginWithGoogle();
		loginWithGoogle.googleLogin(message);
		
	}

}
