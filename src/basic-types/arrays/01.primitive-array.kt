/**
 * Primitive type arrays
 * Kotlin also has specialized classes to represent arrays of primitive types without boxing overhead: ByteArray, ShortArray, IntArray and so on. These classes have no inheritance relation to the Array class, but they have the same set of methods and properties. Each of them also has a corresponding factory function:
 *
 * */
val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]
// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
val asc = Array(5) { i -> (i * i).toString() }
asc.forEach { println(it) }