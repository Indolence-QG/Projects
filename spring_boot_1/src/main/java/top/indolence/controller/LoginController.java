package top.indolence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String test1(){


        return "forward:pages/c.html";
    }
}
