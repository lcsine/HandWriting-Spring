package cn.tang.springframework.beans.factory.support;

import cn.tang.springframework.beans.BeansException;
import cn.tang.springframework.beans.factory.config.BeanDefinition;

/**
 * @author tang
 * 用于实现创建对象的具体功能。因为他是一个抽象类，所以可以只实现其中部分抽象类接口。
 * 在完成bean对象实例化后可以直接调用registerSingleton方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
       Object bean;
       try {
           bean  = beanDefinition.getBeanClass().newInstance();
       }catch (InstantiationException|IllegalAccessException e){
           throw new BeansException("instantiation of ben failed",e);
       }
       registerSingleton(beanName,bean);
       return bean;
    }
}
