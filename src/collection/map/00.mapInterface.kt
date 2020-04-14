package collection.map

import kotlin.collections.Map


/* There are immutable and mutable maps */
interface B {
    public operator fun get(key: String): String?
}

val A: Map<String, String> = mapOf<String, String>("a" to "b")
fun main() {
    val n: Pair<String, Int> = "" to 2
    var n2: B = listOf<String>("") as B
    n2["a"]
}