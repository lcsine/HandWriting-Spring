package cn.tang.springframework.test;

import cn.tang.springframework.BeanDefinition;
import cn.tang.springframework.BeanFactory;
import cn.tang.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 测试类
 * @author tang
 *
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();

        //注册Bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取Bean对象
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
