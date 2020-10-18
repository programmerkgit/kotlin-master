package functionsAndLambdas.lambdas

fun outerFunction(f: () -> Unit) {
    return f()
}
fun main() {
    outerFunction({
        println("lambda can be passed as an argument but not recommanded")
    })
    outerFunction {
        println("function argument can be passed as a trailing lambda expression")
    }
    outerFunction {
        println("to return from lambda you should use label")
        return@outerFunction
    }
    outerFunction(fun() {
        println("anonymous function literal can be passed as an argument")
        return
    })
}