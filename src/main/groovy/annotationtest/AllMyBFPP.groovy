package annotationtest

import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.core.Ordered

class AllMyBFPP implements BeanDefinitionRegistryPostProcessor, Ordered {
    @Override
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //annotated bean
        beanFactory.getBeanDefinition('dataSource').setDependsOn('annotatedBean')
        beanFactory.getBeanDefinition('hibernateDatastore').setDependsOn('annotatedBean')

        //interfaced bean
        beanFactory.getBeanDefinition('dataSource').setDependsOn('interfacedBean')
        beanFactory.getBeanDefinition('hibernateDatastore').setDependsOn('interfacedBean')

    }

    @Override
    int getOrder() {
        Ordered.HIGHEST_PRECEDENCE + 110
    }

    @Override
    void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

    }
}
