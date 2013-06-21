package single

class HelloController {

    def index() {
        render text: lib.Library.random()
    }
}
