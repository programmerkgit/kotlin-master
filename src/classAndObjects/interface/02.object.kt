package classAndObjects.`interface`

import collection.map.B

/* IndexType */
interface IA {
    val a: Int
    val b: Int
}


fun main() {
    val n = object : IA {
        override val a = 3
        override val b = 15
    }
    println("n.a: ${n.a} n.b: ${n.b} ")
}