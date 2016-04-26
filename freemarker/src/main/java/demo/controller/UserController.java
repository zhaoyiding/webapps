package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.domain.User;
import demo.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping({"/user_list","/"})
	public String userList(Model model){
		List<User> userList=userService.getAllUsers();
		model.addAttribute("userList", userList);
		return "list";
		
	}
}
