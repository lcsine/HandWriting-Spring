package cn.tang.springframework;

/**
 * BeanDefinition 用于定义Bean对象，它的实现方式是以一个Object类型存储对象
 * @author tang
 *
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
