package stdlib.io

import java.io.File

fun main() {
    val path = System.getProperty("user.dir")
    val file = File(path).resolve("files/05.txt")
    file.readLines().forEach {
        println(it)
    }
}