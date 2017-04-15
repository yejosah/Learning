package cn.migu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.migu.dao.UserDao;
import cn.migu.model.User;
import cn.migu.service.UserService;

@Service("userService")
public class UserServiceIpml implements UserService
{
    @Autowired
    private UserDao userDao;
    
    public int deleteByPrimaryKey(Integer userId)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public int insert(User record)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public int insertSelective(User record)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public User selectByPrimaryKey(Integer userId)
    {
        // TODO Auto-generated method stub
        return userDao.selectByPrimaryKey(userId);
    }
    
    public int updateByPrimaryKeySelective(User record)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    public int updateByPrimaryKey(User record)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
