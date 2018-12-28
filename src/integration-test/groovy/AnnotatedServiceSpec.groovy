import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
class AnnotatedServiceSpec extends Specification {

    def grailsApplication

//    @DirtiesContext
    def "test something"() {
        expect:"ctx"
        grailsApplication.mainContext
    }
}
