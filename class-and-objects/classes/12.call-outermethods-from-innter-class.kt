fun main() {
    open class OuterC {
        open fun doSome() {
            println("did")
        }
    }


    class Derived: OuterC() {

        inner class InnerC {
            fun a() {
                super@Derived.doSome()
            }
        }
    }

    Derived().InnerC().a()
}