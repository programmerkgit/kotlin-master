package stdlib.io

import java.io.File

fun main() {
    val path = System.getProperty("user.dir")
    val f = File(path).resolve("src/stdlib/io/01.println.kt").inputStream()
    val inputString: String = f.bufferedReader().use { it.readText() }
    println(inputString)
}