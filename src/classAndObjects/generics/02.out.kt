package classAndObjects.generics


/* Tは引数から派生しているクラス(T is derived out of Arg)　*/
interface A<out T> {

}

fun main() {

    /* Int, FloatはNumberを継承している */
    val n: A<Int> = 3 as A<Int>
    var n2: A<Number> = n
    // val n3: A<Float> = n NG
}