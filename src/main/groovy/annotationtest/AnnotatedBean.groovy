package annotationtest


import groovy.util.logging.Slf4j

import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Slf4j
class AnnotatedBean {

    @PostConstruct
    def init() {
        log.error "annotated service created"
    }

    @PreDestroy
    def close(){
        log.error "annotated service closing"
    }

    def method() {
        "test"
    }
}
