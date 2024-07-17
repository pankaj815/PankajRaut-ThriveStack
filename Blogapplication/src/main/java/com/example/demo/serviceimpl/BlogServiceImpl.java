package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.servicei.BlogServiceI;

import jakarta.transaction.Transactional;

@Service
public class BlogServiceImpl implements BlogServiceI {

	@Autowired
	BlogRepository sr;
	
	
	@Override
	public void saveBlog(Blog s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public List<Blog> loginBlog(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("Admin")&& password.equals("Admin"))
		{
			List<Blog>list=(List<Blog>) sr.findAll();
			return list;
		}
		
		else
		{
			List<Blog>list=sr.findByUsernameAndPassword(username, password);
					
					return list;
					
		}
	}

	@Transactional
	@Override
	public List<Blog> deleteBlog(int roolno) {
		// TODO Auto-generated method stub
		sr.deleteByRoolno(roolno);
		return (List<Blog>)sr.findAll();
	}

	@Override
	public Blog editBlog(int roolno) {
		// TODO Auto-generated method stub
		return sr.findByRoolno(roolno);
	}

	@Override
	public List<Blog> updateBlog(Blog s) {
		// TODO Auto-generated method stub
		sr.save(s);
	//	sr.updateData(s.getName(),s.getUsername(),s.getPassword(),s.getRoolno());
		return(List<Blog>)sr.findAll();
	}

}
