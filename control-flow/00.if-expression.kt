package if00

val a = 1
val b = 2;
val c = if (a < b) {
    println("b")
    b
} else {
    println("a")
    a;
}

fun main() {
    if (a < b) {
        println("d")
    }
}
