package cn.migu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.migu.model.User;
import cn.migu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;
    
    @RequestMapping("/show/{userId}")
    public String showUser(ModelMap mp,@PathVariable int userId){
        User user = userService.selectByPrimaryKey(userId);
        mp.addAttribute("user", user);
        return "/user/show";
    }
}
