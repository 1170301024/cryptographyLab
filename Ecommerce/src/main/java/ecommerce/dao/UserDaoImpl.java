package ecommerce.dao;


import ecommerce.mapper.UserMapper;
import ecommerce.pojo.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

@Service("userDaoImpl")
@Scope("prototype")
public class UserDaoImpl implements UserDao{

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserById(int id){
        User user = userMapper.selectUseById(id);
        if(user == null){
            throw new NullPointerException();
        }
        return user;
    }
}
