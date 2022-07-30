package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class LoginController {
    public String test1(){
        System.out.println("hello");
        return "c";
    }
}
