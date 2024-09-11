package com.nelioalves.workshopmongodb.services;

import com.nelioalves.workshopmongodb.domain.User;
import com.nelioalves.workshopmongodb.repository.UserRepository;
import com.nelioalves.workshopmongodb.services.exeption.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
    public User findById(String id) {
        User user = userRepository.findOne(id);
        if (user == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    } **/

}
