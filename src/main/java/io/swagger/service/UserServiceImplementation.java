package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.swagger.model.User;
import io.swagger.mongodb.UserRepository;

@Component
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public boolean createUser(User user) {
		
		// check user data....
		if (true)
			{
				System.out.println(userRepo.findAll().toString());
				User crud = userRepo.save(user);
				System.out.println(crud.toString() +"saved!!!");
				return true;
			}
		else
			//throw new Exception("cannot save, missing data, wtfisthisidonteven!");
		return false;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
