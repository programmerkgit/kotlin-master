class EventManager {
    companion object {
    }
}

interface Outer {
    sealed class D {
        class A {

        }
    }
}

class B : Outer {
    fun a() {}
}

fun main() {
    println("hello, world")

    val anonymousCompanion = EventManager.Companion;
    println(anonymousCompanion)
    val n: A = B
    println(n)
}