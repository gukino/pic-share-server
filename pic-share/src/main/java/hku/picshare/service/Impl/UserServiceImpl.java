package hku.picshare.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hku.picshare.entity.User;
import hku.picshare.mapper.UserMapper;
import hku.picshare.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yhp
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {



}
