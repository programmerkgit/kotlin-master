package classAndObjects.generics

fun main() {
    /**
     * class has type parameter
     */
    class Box<T>(var a: T, var b: T) {
        fun value(): T {
            return b
        }
    }

    /**
     * ??
     */
    val b = Box(1, "a")
}
