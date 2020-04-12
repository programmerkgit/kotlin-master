package functionsAndLambdas.functions

fun main() {
    fun <T> asList(vararg ts: T): ArrayList<T> {
        val result = ArrayList<T>()
        for (t in ts) {
            result.add(t)
        }
        return result
    }
    asList(1,2,3).forEach {
        println(it)
    }
}