package io.swagger.mongodb;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	//List<User> findById(String id);

}
