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

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

}
