package cn.tang.springframework.beans.factory;

import cn.tang.springframework.beans.BeansException;
import cn.tang.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * BeanFactory类是用于生成和使用对象的Bean工厂，BeanFactory类的实现过程包括Bean对象的注册和获取，这里注册的是Bean的定义信息
 * @author tang
 *
 */
public interface  BeanFactory {

    Object getBean(String name) throws BeansException;
}
