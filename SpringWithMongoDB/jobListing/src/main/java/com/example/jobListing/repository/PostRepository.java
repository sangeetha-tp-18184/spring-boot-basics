package com.example.jobListing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.jobListing.model.Post;

public interface PostRepository extends MongoRepository<Post, String>
{
}
