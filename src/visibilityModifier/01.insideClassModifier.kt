package visibilityModifier

fun main() {
    open class A {
        /* default visibility */
        public fun a() {}

        /* only accessible from same file*/
        internal fun b() {}

        /* this class and inherited class */
        protected fun c() {}

        /* this class only */
        private fun d() {}
    }
}
/**
 * For a symbol that is declared inside a class:

public (or omitted): this symbol is visible to any code that can see the containing class
internal: this symbol is only visible to code that exists inside a file that belongs to the same module as the file where this symbol is declared, and that can also see the containing class
protected: this symbol is only visible inside the containing class and all of its subclasses, no matter where they are declared (so if your class is public and open, anyone can subclass it and thus get to see and use the protected members). If you have used Java: this does not also grant access from the rest of the package.
private: this symbol is only visible inside the containing class
 *
 * */

/**
 * A constructor can also have a visibility modifier.
 * If you want to place one on the primary constructor
 * (which you might want to do if you have a number of secondary constructors which all
 *  invoke a complicated primary constructor that you don't want to expose), you need to
 *  include the constructor keyword: class Person private constructor(val name: String).
 *
 * */