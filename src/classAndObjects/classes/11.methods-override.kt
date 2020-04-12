package classAndObjects.classes

fun main() {
    open class BaseClass(open val a: Int, val b: Int) {
        open fun add(): Int {
            return a + b;
        }
    }

    class Derived : BaseClass {
        override val a: Int
            get() = 100

        constructor(a: Int, b: Int, c: Int) : super(a * c, b * c) {
        }

        /* overrided fun should be same type */
        /* override function is open by default. final modifier forbids override by the derivce ancestor */
        final override fun add(): Int {
            return super.add()
        }
    }
    println(Derived(1, 2, 3).add())
}

/*
* It means that, by the time of the base class constructor execution, the properties declared or overridden in the derived class are not yet initialized. If any of those properties are used in the base class initialization logic (either directly or indirectly, through another overridden open member implementation), it may lead to incorrect behavior or a runtime failure. When designing a base class, you should therefore avoid using open members in the constructors, property initializers, and init blocks.
* */