package com.example.jobListing.repository;

import java.util.List;


import com.example.jobListing.model.Post;

public interface Search
{
	List<Post> searchByText(String text) throws Exception;
}
