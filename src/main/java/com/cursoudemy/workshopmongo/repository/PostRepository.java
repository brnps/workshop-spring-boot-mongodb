package com.cursoudemy.workshopmongo.repository;

import com.cursoudemy.workshopmongo.domain.Post;
import com.cursoudemy.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
