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

    public void queryUserInfo(){
        System.out.println("查询用户信息"+name);
    }

    @Override
    public String toString() {
       final StringBuilder sb = new StringBuilder("");
       sb.append("").append(name);
       return sb.toString();
    }
}
