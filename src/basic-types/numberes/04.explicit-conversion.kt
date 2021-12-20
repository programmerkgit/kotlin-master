// Hypothetical code, does not actually compile:
val a: Int? = 1 // functionsAndLambdas.functions.AunctionsAndLambdas.functions.moreLanguageConstructs.A boxed Int (java.lang.Integer)
val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
print(b == a) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well

val b: Byte = 1 // OK, literals are checked statically
val i: Int = b // ERROR

/**
 * toByte(): Byte
 * toShort(): Short
 * toInt(): Int
 * toLong(): Long
 * toFloat(): Float
 * toDouble(): Double
 * toChar(): Char
 * >>> 123.toChar()
 * res2: kotlin.Char = {
 * >>> '['.toInt()
 * res13: kotlin.Int = 91
 * */