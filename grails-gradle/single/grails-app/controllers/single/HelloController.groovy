package single

class HelloController {

    def index() {
        render text: org.apache.commons.lang3.RandomStringUtils.random(20)
    }
}
