fun main() {
    class A {
        var a: Int = 10
            private set
            /*private get: => error. getter's visibility should be same as property visibility*/
    }

    val a = A()
    println(a.a)
}