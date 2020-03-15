fun main() {
    class MyClass {

    }

/* runtime reference to a kotlin class */
    val c = MyClass::class

    class B {

    }

    val b = B()
    println(b::class === B::class)
    val d: B = b::class()
    println(d)
}
