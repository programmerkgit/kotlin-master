fun main() {
    /* primary constructor. val, var parameters are properties */
    class A(a: Int, val b: Int) {
        /* not val parameter should be a */
        val a = a
        fun add(): Int {
            return a + b
        }
    }
    println(A(1,2).add())
}