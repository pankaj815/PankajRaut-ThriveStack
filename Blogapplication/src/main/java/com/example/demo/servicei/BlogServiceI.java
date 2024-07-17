package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Blog;

public interface BlogServiceI {

public void saveBlog(Blog s);
	
	public List<Blog> loginBlog(String username , String password);

	public List<Blog> deleteBlog(int roolno);

	public Blog editBlog(int roolno);

	public List<Blog> updateBlog(Blog s);

	
	
}
