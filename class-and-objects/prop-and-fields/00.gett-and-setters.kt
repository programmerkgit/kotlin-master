fun main() {
    /* var propName[: PropType] [= propInitializer]
    * [getter]
    * [setter]
    * */
    class A {
        val prop = 1; /* getter */
        var prop2 = 2 /* getter and setter*/
        var counter: Int = 0
            set(value) {
                if (value >= 0) field = value
            }
            get() = field + 1

        var incrementalCounter: Int = 0
            set(value) {
                field = value
            }
            get() {
                field = field + 1
                return field
            }
    }

    val a = A()
    a.counter = -1
    println(a.counter)
    a.counter = 2
    println(a.counter)

    println(a.incrementalCounter)
    println(a.incrementalCounter)
    println(a.incrementalCounter)
    println(a.incrementalCounter)
}