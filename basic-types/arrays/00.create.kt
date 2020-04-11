/**
 * Arrays in Kotlin are represented by the Array class,
 * that has get and set functions (that turn into [] by operator
 * overloading conventions), and size property, along with a
 * few other useful member functions:

class Array<T> private constructor() {
val size: Int
operator fun get(index: Int): T
operator fun set(index: Int, value: T): Unit
​
operator fun iterator(): Iterator<T>
// ...
}
To create an array, we can use a library function arrayOf() and pass the item values to it, so that arrayOf(1, 2, 3) creates an array [1, 2, 3]. Alternatively, the arrayOfNulls() library function can be used to create an array of a given size filled with null elements.

Another option is to use the Array constructor that takes the array size and the function that can return the initial value of each array element given its index:

// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
val asc = Array(5) { i -> (i * i).toString() }
asc.forEach { println(it) }
 */

fun main() {
    /* can create array by arrayOf */
    val arr = arrayOf(1, 2, 3)
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val doubled = Array(5) { i -> (i * i).toString() }
    doubled.forEach { println(it) }

    /* array has size property */
    println("Size of dobuled is ${doubled.size}")
}