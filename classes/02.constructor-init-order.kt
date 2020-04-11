fun main() {
    /* primary constructor. val, var parameters are properties */
    class A(val a: Int) {
        /* not val parameter should be a */

        val init1 = "init process 1 is called".also(::println)

        /* secondary constructor should not have val parameter */
        constructor(a: Int, b: Int) : this(a) {
            println("secondary is called")
        }

        val init2 = "init process 2 is called".also(::println)
    }
    A(1, 2)
}