package collection.pair

fun main() {
    val pair: Pair<Int, Int> = 2 to 2
    val copy = pair.copy()
    println(copy)
}