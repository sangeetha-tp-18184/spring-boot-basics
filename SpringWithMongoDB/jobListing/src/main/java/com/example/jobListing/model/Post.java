package com.example.jobListing.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post
{

	private String _id;
	private String desc;
	private int exp;
	private String profile;
	private List<String> techs;

	public Post()
	{

	}

	public String get_id()
	{
		return _id;
	}

	public void set_id(String _id)
	{
		this._id = _id;
	}

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	public int getExp()
	{
		return exp;
	}

	public void setExp(int exp)
	{
		this.exp = exp;
	}

	public String getProfile()
	{
		return profile;
	}

	public void setProfile(String profile)
	{
		this.profile = profile;
	}

	public List<String> getTechs()
	{
		return techs;
	}

	public void setTechs(List<String> techs)
	{
		this.techs = techs;
	}

	@Override public String toString()
	{
		return "Post{" +
			"_id='" + _id + '\'' +
			", desc='" + desc + '\'' +
			", exp=" + exp +
			", profile='" + profile + '\'' +
			", techs=" + techs +
			'}';
	}
}
