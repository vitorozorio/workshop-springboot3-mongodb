package com.nelioalves.workshopmongodb.repository;

import com.nelioalves.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
