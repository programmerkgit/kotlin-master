import java.net.CookieHandler
import kotlin.reflect.KFunction

class MyClass(
    val a: Int,
    val b: String,
    val c: Float
)

fun main() {
    // KFunction
    fun a(n: Int) {

    }

    listOf(1, 2, 3).forEach(action = ::a)

    // :: converts a kotlin function into a lambda
    // https://stackoverflow.com/questions/47400942/what-does-mean-in-kotlin/52463295
    val constructors: Collection<KFunction<MyClass>> = MyClass::class.constructors
    var const: KFunction<MyClass> = ::MyClass
    // Collection<KFunction<MyClass>> -> parameters -> List<KParameter> -> index
    constructors.forEach { constructor ->
        println("::MyClass == constructors[i] equals ${constructor == const}")
        println(constructor.isExternal)
        println(constructor.isInfix)
        println(constructor.isInline)
        println(constructor.isOperator)
        println(constructor.isSuspend)
        println(constructor.isFinal)
        println(constructor.isOpen)
        println(constructor.parameters) // List<KParameter>
        println(constructor.typeParameters)
        println(constructor.visibility)
        println(constructor::call)
        println(constructor::callBy)
    }
}