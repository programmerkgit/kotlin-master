import kotlin.math.abs
import kotlin.math.pow
import kotlin.reflect.KProperty
import kotlin.reflect.full.memberProperties

class Solution {
    fun reverse(x: Int): Int {
        val num = x.toString().replace("-", "").reversed().toDouble()
        return if (x < 0) {
            if (num > 2f.pow(31)) {
                0
            } else {
                -num.toInt()
            }
        } else {
            if (num >= 2f.pow(31)) {
                0
            } else {
                num.toInt()
            }
        }
    }
}
