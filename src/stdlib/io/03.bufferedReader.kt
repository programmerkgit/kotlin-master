package stdlib.io

import java.io.File

fun main() {
    val path = System.getProperty("user.dir")
    val byteArray: ByteArray = ByteArray(8)
    byteArray[0] = 0x61 // a
    byteArray[1] = 0x62 // b
    byteArray[2] = 'c'.toByte()
    byteArray[3] = "x".toByteArray()[0] // x
    byteArray[4] = 0x79 // y
    /* 0x80は存在しない(なぜ??) */
    byteArray[5] = 122.toByte() // z
    byteArray[6] = 0x41  // functionsAndLambdas.functions.AunctionsAndLambdas.functions.moreLanguageConstructs.A
    byteArray[7] = 0x5A  // Z
    /* appendText: text => toByteArray => write to stream */
    File(path).resolve("files/03.txt").appendBytes(byteArray)
}