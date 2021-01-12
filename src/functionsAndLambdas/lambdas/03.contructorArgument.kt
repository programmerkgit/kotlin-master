package functionsAndLambdas.lambdas

fun main() {
    class User(val name: String)

    fun factory(f: (name: String) -> User): User {
        return f("John")
    }
    println(factory(::User).name)
}