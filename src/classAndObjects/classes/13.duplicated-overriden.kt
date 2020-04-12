package classAndObjects.classes

open interface B {
    open fun a() {
        println("classAndObjects.classes.B.a")
    }
}

fun main() {
    open class A {
        open fun a() {
            println("A.a")
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