package hku.picshare.controller;


import hku.picshare.entity.User;
import hku.picshare.service.UserService;
import hku.picshare.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/newUser")
    @ResponseBody
    public ResponseMsg newUser(User user){
        return userService.newUser(user);
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public ResponseMsg UserLogin(String email,String pwd){
        return userService.login(email,pwd);
    }

}
