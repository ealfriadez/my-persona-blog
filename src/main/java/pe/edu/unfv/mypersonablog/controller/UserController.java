package pe.edu.unfv.mypersonablog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.unfv.mypersonablog.entity.UserEntity;
import pe.edu.unfv.mypersonablog.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/record")
    public String recordPage(){
        return "/users/register";
    }

    @PostMapping("/register")
    public String register(UserEntity user){
        userService.createUser(user);
        return "redirect:/login";
    }

    @GetMapping(value = {"/login", "/"})
    public String loginPage(){
        return "/users/login";
    }
}
