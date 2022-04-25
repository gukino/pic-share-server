package hku.picshare.controller;


import hku.picshare.entity.User;
import hku.picshare.service.UserService;
import hku.picshare.util.RequestMsg;
import hku.picshare.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value = "/register")
    @ResponseBody
    public ResponseMsg newUser(@RequestBody RequestMsg requestMsg){
        return userService.newUser(requestMsg.user);
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public ResponseMsg UserLogin(String email,String pwd){
        return userService.login(email,pwd);
    }

}
