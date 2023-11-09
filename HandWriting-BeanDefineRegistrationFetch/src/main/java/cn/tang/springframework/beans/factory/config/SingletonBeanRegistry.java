package cn.tang.springframework.beans.factory.config;

/**
 * @author tang
 * SingletonBeanRegistry类，主要用于定义一个注册和获取单例对象的接口
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
    void registerSingleton(String beanName,Object singletonObject);

}
