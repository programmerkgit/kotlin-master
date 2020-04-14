package classAndObjects.generics

interface L {

}

interface M {

}

interface N : L, M {

}

/* Tは引数が実装している型のうちの一つ(T is Partial Interface in Arg) */
interface B<in T> {

}

fun main() {
    var l: B<L> = 1 as B<L>
    var m: B<M> = 1 as B<M>
    var n: B<N> = 1 as B<N>
    l = 1 as B<L>
//    l = 1 as B<M> NG
//    l = 1 as B<N> NG
//    m = 1 as B<L>
    m = 1 as B<M>
//    m = 1 as B<N>
    n = 1 as B<L>
    n = 1 as B<M>
    n = 1 as B<N>
}