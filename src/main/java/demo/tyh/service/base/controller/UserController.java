package demo.tyh.service.base.controller;

import demo.tyh.service.base.entity.User;

import demo.tyh.service.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/UserController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert",method=RequestMethod.GET)
    public User insertUser(User user){
        return userService.insertUser(user);
    }
}
