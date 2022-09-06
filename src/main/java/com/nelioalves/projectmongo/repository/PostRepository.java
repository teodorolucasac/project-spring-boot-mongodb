package com.nelioalves.projectmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.projectmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}
