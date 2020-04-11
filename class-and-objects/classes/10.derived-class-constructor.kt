fun main() {
    open class BaseClass(val a: Int) {

    }

    class Derivde : BaseClass {
        constructor(a: Int, b: Int) : super(a + b) {

        }
    }
    println(Derivde(1,2).a)
}