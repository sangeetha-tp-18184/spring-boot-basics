package com.example.jobListing.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.example.jobListing.model.Post;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class SearchByText implements Search
{
	@Autowired
	MongoClient mongoClient;

	@Autowired
	MongoConverter converter;

	@Override public List<Post> searchByText(String text) throws Exception
	{
		List<Post> posts = new ArrayList<>();
		MongoDatabase database = mongoClient.getDatabase("Job");
		MongoCollection<Document> collection = database.getCollection("JobPost");
		AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
				new Document("text",
					new Document("query", text)
						.append("path", "techs"))),
			new Document("$sort",
				new Document("exp", -1L)),
			new Document("$limit", 5L)));

		result.forEach(document -> posts.add(converter.read(Post.class, document)));
		return posts;
	}
}
