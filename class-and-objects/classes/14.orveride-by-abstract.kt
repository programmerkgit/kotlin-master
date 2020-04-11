open class Polygon {
    open fun draw() {
        println("drawed")
    }
}

abstract class Rectangle : Polygon() {
    override fun draw() {
        super.draw()
    }

    abstract fun n()
}

fun main() {
    class A() : Rectangle() {
        override fun draw() {
            super.draw()
        }

        override fun n() {
            TODO("Not yet implemented")
        }
    }

    A().draw()
}