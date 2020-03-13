import jdk.nashorn.internal.ir.RuntimeNode

fun main() {
    val a: Int = 12
    val b: Int = 20
    when (33) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or x == 4")
        in 5..10 -> println("5 <= x and x >= 10")
        b -> println("b")
        is Number -> println("number")
        else -> println("else")
    }
/* no argument */
    when() {
        a.isOdd() -> println("a is odd")
        a.isEven() -> println("a is even")
        else -> println("x is funny")
    }

    fun switches(x: Int) = when (x) {
        is Number -> println("number")
        else -> print("x is funny")
    }

    var Request: Any = Array<Number>(1, 4);
    /* initialize when subject */
    fun RuntimeNode.Request.getBody() =
        when (val response = executeRequest()) {
            is Success -> response.body
            is HttpError -> throw HttpException(response.status)
        }

    fun max(a: Int, b: Int): Int {
        val max = if (a > b) {
            println("choose a")
            a
        } else {
            println("choose b")
            b
        }
        max;
        return "bac"
    }
}