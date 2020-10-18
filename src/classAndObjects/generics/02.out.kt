package classAndObjects.generics


/* Tは引数から派生しているクラス(T is derived out of Arg)　*/
interface ParentInterface<out T> {
    fun returnT(): T
}

class DerivedClass : ParentInterface<Number> {
    override fun returnT(): Int {
        TODO("Not yet implemented")
    }
}

fun main() {
}