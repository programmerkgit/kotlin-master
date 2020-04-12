package classAndObjects.classes

fun main( ){

    class A {
        val a = "primary initialization is called".also(::println)
        constructor(a: Int) {
            println("secondary constructor is called")
        }
    }

    A(1)
}