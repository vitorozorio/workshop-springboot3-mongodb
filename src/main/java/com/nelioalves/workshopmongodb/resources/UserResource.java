package com.nelioalves.workshopmongodb.resources;

import com.nelioalves.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
       User natalia = new User("1","Natalia Alves", "maria@gmail.com");
        User vitor = new User("2","Vitor Ozorio", "vitor@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(natalia, vitor));
        return ResponseEntity.ok().body(list);
    }
}
