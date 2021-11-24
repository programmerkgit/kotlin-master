package basics.property

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberExtensionProperties
import kotlin.reflect.full.memberProperties

fun main() {
    /*https://kotlinlang.org/docs/scope-functions.html#apply*/
    class Test(var a: Int, var b: Int)
    data class ToBeUpdateed(var a: Int, var b: Int, val c: Int = 253)

    val nameToProp = ToBeUpdateed::class.memberProperties.associateBy(KProperty<*>::name)
    val target = ToBeUpdateed(10, 20)

    val t = Test(100, 3)
    Test::class.memberProperties.forEach { v ->
        val targetProp = nameToProp[v.name]
        targetProp.let { it as KMutableProperty<*> }
            .also { it.setter.call(target, v.get(t)) }
    }
    println(target)
}