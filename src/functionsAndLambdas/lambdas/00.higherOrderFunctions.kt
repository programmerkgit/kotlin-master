package functionsAndLambdas.lambdas

fun main() {

    /* define reduce on Collection */
    fun <T, R> Collection<T>.foldA(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
    ): R {
        var accumulator: R = initial
        for (el: T in this) {
            accumulator = combine(accumulator, el)
        }
        return accumulator
    }

    val col = listOf<Int>(1, 2, 3)

    /* pass lambda as argument */
    val result = col.foldA(10, { acc: Int, el: Int ->
        acc + el
    })
    println(result)
}