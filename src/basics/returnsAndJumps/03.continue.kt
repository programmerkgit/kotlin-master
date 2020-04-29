package basics.returnsAndJumps

fun main() {
    /**
     * return can be used in anonymous function. but not in lambda.
     * */
    loop@ for (a in listOf(1, 2)) {
        println(a)
        if (a > 1) {
            continue@loop
        }
        println("after continue")
    }
}