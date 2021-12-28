package todo

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification
import validations.ValidationsService

class ValidationsServiceSpec extends Specification implements ServiceUnitTest<ValidationsService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
