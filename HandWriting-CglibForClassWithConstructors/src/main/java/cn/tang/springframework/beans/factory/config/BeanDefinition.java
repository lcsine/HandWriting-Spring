package cn.tang.springframework.beans.factory.config;

/**
 * BeanDefinition 将object bean替换成为Class类型，这样就可以将Bean对象的实例化放到容器中处理
 *
 * @author tang
 */
public class BeanDefinition {
    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {

        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }


}
