package functionsAndLambdas.functions

open class A {
    open fun a(default: Int = 10): Int {
        return 3
    }
}

class B : A() {
    override fun a(default: Int): Int {
        return super.a(default)
    }
}

fun main() {
    val b = B()
    println(b.a())
}