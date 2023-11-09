package test.bean;

/**
 *这里简单定义一个UserService对象类方便对Spring Bean容器进行测试
 * @author tang
 *
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息");
    }
}
