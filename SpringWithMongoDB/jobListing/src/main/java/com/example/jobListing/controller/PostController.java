package com.example.jobListing.controller;

import jakarta.servlet.http.HttpServletResponse;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobListing.model.Post;
import com.example.jobListing.repository.PostRepository;
import com.example.jobListing.repository.Search;

@RestController
public class PostController
{

	@Autowired
	PostRepository repository;

	@Autowired
	Search searchRepo;

	@GetMapping("/")
	public String redirect(HttpServletResponse response) throws IOException
	{
		return "redirect:/swagger-ui/index.html";
	}

	@GetMapping("/posts")
	public List<Post> getPosts() {

		return repository.findAll();
	}

	@GetMapping("/posts/{text}")
	public List<Post> getPostsByText(@PathVariable String  text) throws Exception {
		return searchRepo.searchByText(text);
	}

	@PostMapping("/posts")
	public Post createPost(@RequestBody  Post post) {
		return repository.save(post);
	}

}
