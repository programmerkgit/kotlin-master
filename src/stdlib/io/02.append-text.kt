package stdlib.io

import java.io.File

fun main() {
    val path = System.getProperty("user.dir")
    File(path).resolve("file-io-targets/02.append-text.txt").appendText("\nライン3")
}