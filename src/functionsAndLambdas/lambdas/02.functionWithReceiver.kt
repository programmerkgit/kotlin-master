package functionsAndLambdas.lambdas

fun main() {

    /* Declare function with receiver class */
    val sum = fun Int.(other: Int): Int = this + other
    println("${2.sum(5)} is sum of 2 and 5")

    /* Receiver can be passed as an first argument */
    println("1 + 2 = ${sum(1, 2)}")

    /* Declare function on a existing class */
    fun Int.sub(b: Int): Int {
        return this - b
    }
    println("3 - 2 = ${3.sub(2)}")
    /**
     * Cannot call sum(3, 2). When you want to pass receiver as an argument you should
     * declare variable and assign function to that variable
     * */

    /* receiver can be generated inside the function */
    class HTML {
        fun body() {}
    }

    fun html(init: HTML.() -> Unit) {
        val html = HTML()  // create the receiver object
        html.init()        // pass the receiver object to the lambda
    }

    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }
}