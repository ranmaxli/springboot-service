package com.ranmaxli.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liran on 2019/12/28 0028.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //page access
    @RequestMapping("/index")
    public String index(){return "index";}

    //page access
    @RequestMapping("/register")
    public String register(){return "register";}

    //page access
    @RequestMapping("/revise")
    public String revise(){return "revise";}

    //page access
    @RequestMapping("/cancel")
    public String cancel(){return "cancel";}
}
