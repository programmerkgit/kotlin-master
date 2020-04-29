package moreLanguageConstructs

fun main() {
    val b: String? = "Kotlin"
    if (b != null) {
        val n: String = b
    } else {
        val n: String = b!!
    }

    /* if not null */
    val a = if (b != null) 1 else 2
    /* elvis */
    val c = b ?: 2 // c is 2 if b is null
}