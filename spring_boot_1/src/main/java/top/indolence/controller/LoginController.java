package top.indolence.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.indolence.domain.User;
import top.indolence.service.UserService;

import javax.annotation.Resource;

@Controller
@CrossOrigin(origins = "*" , maxAge = 3600)
public class LoginController {


    @Resource
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user){

            boolean islogin = userService.login(user);
            if (islogin)
            return  "success";
        return "fail";
    }
}
