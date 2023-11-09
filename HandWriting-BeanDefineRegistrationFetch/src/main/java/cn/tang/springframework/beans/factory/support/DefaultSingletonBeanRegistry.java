package cn.tang.springframework.beans.factory.support;

import cn.tang.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tang
 * DefaultSingletonBeanRegistry类主要实现获取单例对象的方法（getSingleton）和注册单例对象的方法（registerSingleton）
 * 这两个方法都可以被继承此类的其他类调用
 * 如AbstractBeanFactory类及DefaultListableBeanFactory类
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName,singletonObject);
    }
}
