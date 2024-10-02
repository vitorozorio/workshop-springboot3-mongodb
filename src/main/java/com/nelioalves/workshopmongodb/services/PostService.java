package com.nelioalves.workshopmongodb.services;

import com.nelioalves.workshopmongodb.domain.Post;
import com.nelioalves.workshopmongodb.repository.PostRepository;
import com.nelioalves.workshopmongodb.services.exeption.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepositoryrepo;

    public Post findById(String id) {
        Optional<Post> obj = postRepositoryrepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return postRepositoryrepo.findByTitleContainingIgnoreCase(text);
    }


}
