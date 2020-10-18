package functionsAndLambdas.lambdas

fun main() {
    /* Usage of function types */

    /* Declare a unction type */
    var modulo: (x: Int, m: Int) -> Int
    modulo = fun(x: Int, m: Int): Int {
        return x.rem(m)
    }
    println("${modulo(10, 3)} is remain of 10 / 3")

    /* Lambda can be assigned to function type */
    var double: (Int) -> Int
    double = { x: Int -> x * 2 }
    println("${double(2)} is double of 2")

    /* Anonymous function can be assigned to a variable. */
    val square = fun(x: Int): Int {
        return x * x
    }
    println("${square(3)} is square of 3")

    /* Declare function on existing type. */
    fun Collection<Int>.a(): Int {
        return this.size
    }
    println("${listOf(1, 2, 3).a()} is length of listOf(1,2,3)")

    /* Last function type argument can be passed by trailing lambda expression. */
    fun Collection<Int>.convert(converter: (Int) -> Int): Collection<Int> {
        val result: MutableCollection<Int> = mutableListOf()
        for (el: Int in this) {
            result.add(converter(el))
        }
        return result
    }

    val result = listOf(1, 2, 3, 4).convert {
        it * it
    }
    println("1,2,3,4 is converted to bellow numbers")

    result.forEach {
        println(it)
    }
}