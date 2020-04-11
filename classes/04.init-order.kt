fun main() {
    class InitOrder(a: String, b: Int) {
        val firstProp = "First Prop $a".also(::println)

        init {
            println("first init")
        }

        val secondProp = "Second Prop $b".also(::println)

        init {
            println("second init")
        }
    }

    val n = InitOrder("a", 3)
}
/*
* First Prop 2
  first init
  Second Prop 3
  second init
*/