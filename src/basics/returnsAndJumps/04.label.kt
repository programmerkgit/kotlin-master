package basics.returnsAndJumps

fun main() {
    /**
     * return can be used in anonymous function. but not in lambda.
     * */
    loop@ for (x in listOf(1, 2)) {
        println("begin outer loop")
        for (a in listOf(1, 2)) {
            println("begin inner loop")
            if (a > 0) {
                break@loop
            }
            println("end inner loop")
        }
        println("end outer loop")
    }
    println("end moreLanguageConstructs.moreLanguageConstructs.moreLanguageConstructs.reference.classAndObjects.generics.collection.operations.paiza.paizaw.`leat-code`.basics.property.main")
}