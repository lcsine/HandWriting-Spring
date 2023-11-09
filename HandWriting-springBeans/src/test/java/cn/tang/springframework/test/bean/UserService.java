package cn.tang.springframework.test.bean;

/**
 *这里简单顶一个UserService对象类方便对Spring Bean容器进行测试
 * @author tang
 *
 */
public class UserService {
    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }
}
