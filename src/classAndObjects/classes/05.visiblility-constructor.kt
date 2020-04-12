package classAndObjects.classes

fun main() {
    class A public constructor(a: Int, b: Int) {
        val c = a + b
    }

    println(A(1,2).c)
}