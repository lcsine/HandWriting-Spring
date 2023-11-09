package cn.tang.springframework.beans.factory;

import cn.tang.springframework.beans.BeansException;

/**
 * BeanFactory类是用于生成和使用对象的Bean工厂，BeanFactory类的实现过程包括Bean对象的注册和获取，这里注册的是Bean的定义信息
 * @author tang
 *versions 3.0
 * 重载了一个含有入参信息args的getBean构造函数，这样就可以将构造函数的入参信息传递给实例化方法进行实例化
 */
public interface  BeanFactory {

    Object getBean(String name) throws BeansException;
    Object getBean(String name,Object ... args) throws BeansException;
}
