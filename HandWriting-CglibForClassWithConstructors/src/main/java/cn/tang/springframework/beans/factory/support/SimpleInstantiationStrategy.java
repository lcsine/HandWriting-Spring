package cn.tang.springframework.beans.factory.support;

import cn.tang.springframework.beans.BeansException;
import cn.tang.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author tang
 * 首先通过beanDefinition获取Class信息。Class信息是在定义Bean对象是传递进去的
 * 然后判断ctor是否为空，则无构造函数可实例化；如果不为空，则需要传递构造函数的入参信息进行实例化，即将入参信息传递给newInstance进行实例化
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if (null != ctor){
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }
            else {
                return clazz.getDeclaredConstructor().newInstance();
            }

        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" +clazz.getName()+"]",e);
        }

    }
}
