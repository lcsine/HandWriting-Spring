package test;

import cn.tang.springframework.beans.factory.config.BeanDefinition;
import cn.tang.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserService;

/**
 * 测试类
 * @author tang
 *
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //初始化 beanFactory接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //注册Bean对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取Bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        //再次获取和调用Bean对象
        UserService userService_singleton =(UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();

    }

}
