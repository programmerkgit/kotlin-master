package functionsAndLambdas.lambdas

fun main() {
    val sum = fun Int.(other: Int): Int = this + other
    println("${2.sum(5)} is sum of 2 and 5")

    val subtract = fun Int.(other: Int): Int {
        return this - other
    }
    println("${5.subtract(2)} is 5 - 2")

    /* receiver can be generated inside the function */
    class HTML {
        fun body() {}
    }

    fun html(init: HTML.() -> Unit): HTML {
        val html = HTML()  // create the receiver object
        html.init()        // pass the receiver object to the lambda
        return html
    }

    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }
}