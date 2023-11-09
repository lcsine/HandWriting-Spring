package cn.tang.springframework.beans.factory.support;

import cn.tang.springframework.beans.BeansException;
import cn.tang.springframework.beans.factory.BeanFactory;
import cn.tang.springframework.beans.factory.config.BeanDefinition;

/**
 * @author tang
 * 这运用模板模式定义了一个流程标准的用于获取对象的AbstractBeanFactory抽象类，并采用职责分离的结构设计，
 * 继承DefaultSingletonBeanRegistry,使用其提供的单例对象注册和获取功能，
 * 通过BeanFactory接口提供一个功能单一的方法，屏蔽了内部逻辑细节
 * 这里BeanFactory接口一个获取对象的方法getBean，然后由其抽象类实现细节。
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    /**
     * 在getBean方法中可以看到，它主要用于获取单例Bean对象，以及在无法获取Bean对象时做相对应Bean对象实例化。
     * getBean自身并没有实现这些方法，只是定义了调用过程并提供了抽象方法
     * @param name
     * @return {@link Object}
     * @throws BeansException 定义Bean异常
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean !=null){
            return bean;
        }
        BeanDefinition beanDefinition = getbeanDefinition(name);
        return createBean(name,beanDefinition);
    }
    protected abstract  BeanDefinition getbeanDefinition(String beanName) throws BeansException;
    protected abstract  Object createBean(String beanName,BeanDefinition beanDefinition)throws BeansException;
}
