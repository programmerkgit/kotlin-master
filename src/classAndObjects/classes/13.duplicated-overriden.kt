package classAndObjects.classes

open interface B {
    open fun a() {
        println("classAndObjects.classes.functionsAndLambdas.functions.B.a")
    }
}

fun main() {
    open class A {
        open fun a() {
            println("functionsAndLambdas.functions.AunctionsAndLambdas.functions.A.a")
        }
    }


    class Derived() : A(), B {
        override fun a() {
            super<A>.a()
            super<B>.a()
        }
    }
    Derived().a()
}