package basics.returnsAndJumps

fun main() {
    /**
     * return can be used in anonymous function. but not in lambda.
     * */
    listOf(1, 2).map(fun(a: Int): Int {
        return a * a
    }).forEach {
        println(it)
    }
    listOf(1, 2).forEach {
        println("$it: forEach")
        return@forEach // can return from lambda
    }

    listOf(1, 2).forEach a@{
        println("$it: forEach@a")
        return@a // can return from lambda
    }

    listOf(1, 2).forEach { _ ->
        return // return from moreLanguageConstructs.moreLanguageConstructs.moreLanguageConstructs.reference.classAndObjects.generics.collection.operations.main because lambed is not function.
    }
    println("end of moreLanguageConstructs.moreLanguageConstructs.moreLanguageConstructs.reference.classAndObjects.generics.collection.operations.main")
}