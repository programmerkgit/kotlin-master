fun main() {
    /* secondry constructor is overload and delegate to primary by :this() */
    class Person(val name: String) {
        var children: MutableList<Person> = mutableListOf<Person>();

        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    }

    val parent = Person("Parent")
    val chold = Person("Child", parent)
    println(parent.children[0].name)
}