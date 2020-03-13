fun main() {
    println(a())
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // return from main.
        println(it)
    }
    println("return from main")
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // return from ramda
        println(it)
    }
    println("returned from lambda")

    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // return from ramda
        println(it)
    }
    println("returned from lambda 2")

    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
        print(value)
    })
    print(" done with anonymous function")

    run label@{
        listOf<Number>(1, 2, 3, 4, 5).forEach {
            if (it == 3) {
                return@label
            }
            println(it)
        }
    }
}

fun a(): Int {
    return run b@{
        return@b 1
    }
}
