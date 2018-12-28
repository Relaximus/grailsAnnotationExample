package annotationtest


import groovy.util.logging.Slf4j
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean

@Slf4j
class InterfacedBean implements DisposableBean, InitializingBean {

    @Override
    void destroy() throws Exception {
        log.error "interfaced service closed"
    }

    @Override
    void afterPropertiesSet() throws Exception {
        log.error "interfaced service created"
    }

    def method() {
        "test"
    }
}
