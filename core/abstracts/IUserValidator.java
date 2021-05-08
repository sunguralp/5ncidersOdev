package core.abstracts;

import entities.concretes.User;

public interface IUserValidator {
	boolean validate(User user);
}
