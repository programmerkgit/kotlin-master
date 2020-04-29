package moreLanguageConstructs/*
* Equality
In Kotlin there are two types of equality:

Structural equality (a check for equals()).
Referential equality (two references point to the same object);
Structural equality
Structural equality is checked by the == operation (and its negated counterpart !=). By convention, an expression like a == b is translated to:

a?.equals(b) ?: (b === null)
I.e. if a is not null, it calls the equals(Any?) function, otherwise (i.e. a is null) it checks that b is referentially equal to null.

Note that there's no point in optimizing your code when comparing to null explicitly: a == null will be automatically translated to a === null.

To provide a custom equals check implementation, override the equals(other: Any?): Boolean function. Functions with the same name and other signatures, like equals(other: Foo), don't affect equality checks with the operators == and !=.

Structural equality has nothing to do with comparison defined by the Comparable<...> interface, so only a custom equals(Any?) implementation may affect the behavior of the operator.

Floating point numbers equality
When an equality check operands are statically known to be Float or Double (nullable or not), the check follows the IEEE 754 Standard for Floating-Point Arithmetic.

Otherwise, the structural equality is used, which disagrees with the standard so that NaN is equal to itself, and -0.0 is not equal to 0.0.

See: Floating Point Numbers Comparison.

Referential equality
Referential equality is checked by the === operation (and its negated counterpart !==). a === b evaluates to true if and only if a and b point to the same object. For values which are represented as primitive types at runtime (for example, Int), the === equality check is equivalent to the == check.
* */

fun main() {
    // a == b => a?.equals(b) ?: (b === null)
    /* object equality, but primitive types are equivalent to == check */
    val a = 1
    val b = 1
    val n = a === b // => true because both of which is primitive
    println(n)
}