package cn.migu.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.migu.model.User;
import cn.migu.service.UserService;

/**
 * 
 *
 * @author yejiaxu
 * @version C10 2017年4月6日
 * @since SDP V300R003C10
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" }) 
public class TestUserService
{
    private static Logger logger = Logger.getLogger(TestUserService.class);
    
    @Autowired
    private UserService userService;
    
    @Test
    public void testQueryById(){
        User user = userService.selectByPrimaryKey(11);
        logger.info(JSON.toJSON(user));
    }
}
