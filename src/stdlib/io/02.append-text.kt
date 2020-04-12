package stdlib.io

import java.io.File

fun main() {
    val path = System.getProperty("user.dir")
    File(path).resolve("files/02.txt").appendText("\nライン3")
}