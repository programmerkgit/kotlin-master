package moreLanguageConstructs

import javax.lang.model.type.NullType
import kotlin.concurrent.fixedRateTimer

fun main() {
    /* is cast */
    val a: String? = ""
    if (a is String) {
        val b: String = a
    } else if (a !is String) {
        // val c: String = a
        val c: String = a!!
    }
    /* smart cast */
    fun demo(x: Any) {
        if (x is String) {
            val c: String = x
        }
    }
    /* String if not null */
    val x: String? = a as? String
    /* safe after return */
    if (a !is String) return
    val n: String = a
}