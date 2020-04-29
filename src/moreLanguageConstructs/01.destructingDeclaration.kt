package moreLanguageConstructs

fun main() {
    data class Result(val a: Int, val b: Int)
    val (a, b) = Result(1, 2)
    fun function(): Result {
        return Result(2, 3)
    }
    val (c, d) = function()

    println("a:$a b:$b c:$c d:$d")
    mapOf(1 to 2, 2 to 3, 3 to 4, 4 to 5).forEach { (t, u) ->
        println("$t $u")
    }
    for ((key, value) in mapOf(1 to 2, 2 to 3, 3 to 4, 4 to 5)) {
        println("a:$key b:$value")
    }
}