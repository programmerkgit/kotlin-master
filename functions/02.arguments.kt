fun paramIsTyped(a: String, b: Int, c: Array, d: Any) {

}

fun defaultArguments(number: Int = 0) {

}

open class A {
    fun a(default: Int = 10) {
    }
}

class B : A() {
    override fun a(default: Int = 10) {
        return default
    }
}

fun main() {
    val b = B()
    println(b.a())
}