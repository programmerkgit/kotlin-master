package reflection

// https://kotlinlang.org/docs/reflection.html#class-references
fun main() {
    class MyClass(
        val param1: Int = 1
    )

    val instanceOfMyClass = MyClass()
    // this is true
    println("MyClass === instanceOfMyClass is ${MyClass::class === instanceOfMyClass::class}")
    // type of ::class is KClass
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/
    println("We can access parameter through MyClass param1 ${MyClass::param1.get(instanceOfMyClass)}")
    println("We can access name of param1. Name of param1 is ${MyClass::param1.name}")
}