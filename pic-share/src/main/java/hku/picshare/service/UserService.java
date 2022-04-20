package hku.picshare.service;

import hku.picshare.dao.UserDAO;
import hku.picshare.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hqj
 * 用户service
 */

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public User getUserById(int id){
        return userDAO.getUserById(id);
    }
}
