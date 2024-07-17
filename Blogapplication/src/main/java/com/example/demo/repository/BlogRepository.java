package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer>{
	List<Blog> findByUsernameAndPassword(String username, String password);

	void deleteByRoolno(int roolno);

	public Blog findByRoolno(int roolno);

}
