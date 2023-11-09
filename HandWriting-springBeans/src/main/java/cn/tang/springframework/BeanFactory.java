package cn.tang.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * BeanFactory类是用于生成和使用对象的Bean工厂，BeanFactory类的实现过程包括Bean对象的注册和获取，这里注册的是Bean的定义信息
 * @author tang
 *
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    public  Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
