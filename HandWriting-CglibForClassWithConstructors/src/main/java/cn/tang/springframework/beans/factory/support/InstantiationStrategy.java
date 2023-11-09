package cn.tang.springframework.beans.factory.support;

import cn.tang.springframework.beans.BeansException;
import cn.tang.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
