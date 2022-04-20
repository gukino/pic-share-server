package hku.picshare.controller;

import hku.picshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/get")
    public void getUser(int id){

        System.out.println(userService.getUserById(1).toString());
    }

}
