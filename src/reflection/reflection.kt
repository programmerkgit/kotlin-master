package reflection

// https://kotlinlang.org/docs/reflection.html#class-references
fun classReference() {
    class MyClass
    val instanceOfMyClass = MyClass()
    // this is true
    println("MyClass === instanceOfMyClass is ${MyClass::class === instanceOfMyClass::class}")
    // type of ::class is KClass
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/
}