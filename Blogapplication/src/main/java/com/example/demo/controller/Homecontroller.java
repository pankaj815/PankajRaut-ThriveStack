													package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Blog;
import com.example.demo.servicei.BlogServiceI;

@Controller
public class Homecontroller {

	
	@Autowired
	BlogServiceI ssi;
	
	@RequestMapping("/")
	public String prelogin()
	{

		return "login";
	}
	
	@RequestMapping("/openreg")
	public String preregister()
	{
		
		return "register";
	}
	
	
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute Blog s)
	{
		ssi.saveBlog(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String loginStudent(@RequestParam("username")String username,@RequestParam("password")String password,Model m)
	{
		List<Blog>list=ssi.loginBlog(username, password);
      if(!list.isEmpty())
      {
    	 m.addAttribute("data",list);
    	 
    	 return "success";
      }
      
      else
      {
    	  return "login"; 
      }
       
	}
	
	 @RequestMapping("/delete")
     public String deleteStudent(@RequestParam("roolno")int roolno,Model m)
     {      
   	  List<Blog>list=ssi.deleteBlog(roolno);
   	  m.addAttribute("data", list);
		 
		 return"success";
     }
	 
	 @RequestMapping("/edit")
	 public String editStudent(@RequestParam int roolno,Model m)
	 {
		 Blog s=ssi.editBlog(roolno);
		 m.addAttribute("stu", s);
		 return "edit";
	 }
	 
	 @RequestMapping("/update")
	 public String updateStudent(@ModelAttribute Blog s,Model m)
	 {
		List<Blog>list=ssi.updateBlog(s); 
		m.addAttribute("data", list);
		return "success";
	 }

	
	
	
	
}
