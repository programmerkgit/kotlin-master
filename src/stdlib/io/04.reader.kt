package stdlib.io

import java.io.File
import java.io.InputStreamReader

fun main() {
    val path = System.getProperty("user.dir")
    /* inputStream is for binary */
    /* inputStreamReader is for strings */
    val reader: InputStreamReader = File(path).resolve("files/04.txt").reader()
    reader.use { reader ->
        var result = reader.read()
        while (result != -1) {
            print(result.toChar())
            result = reader.read()
        }
    }
}