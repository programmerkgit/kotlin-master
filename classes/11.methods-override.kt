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