package paizaw2

fun main(args: Array<String>) {
    val (n, m, l) = readLine()!!.split(" ").map { it.toInt() }
    val dogMonkeyMatrix: MutableMap<Int, MutableMap<Int, Boolean>> = mutableMapOf()
    val reversedDogMonkeyMatrix: MutableMap<Int, MutableSet<Int>> = mutableMapOf()

    data class Group(
        val dogSet: MutableSet<Int> = mutableSetOf(),
        val monkeySet: MutableSet<Int> = mutableSetOf()
    ) {

        fun addDog(d: Int) {
            dogSet.add(d)
        }

        fun addMonkey(m: Int) {
            monkeySet.add(m)
        }

        private fun hasDog(d: Int): Boolean {
            return dogSet.contains(d)
        }

        private fun hasMonkey(m: Int): Boolean {
            return monkeySet.contains(m)
        }

        fun removeDog(d: Int) {
            dogSet.remove(d)
        }

        fun removeMonkey(m: Int) {
            monkeySet.remove(m)
        }

        fun withoutDog(d: Int): Group {
            val cop = copy()
            cop.removeDog(d)
            return cop
        }

        fun copy(): Group {
            return copy(dogSet = dogSet.toMutableSet(), monkeySet = monkeySet.toMutableSet())
        }

        fun withoutMonkeys(ms: Set<Int>): Group {
            val cop = copy()
            cop.monkeySet.removeAll(ms)
            return cop
        }

        fun getSize(): Int {
            var count = 0;
            for (i in 1..n) {
                if (hasDog(i)) {
                    count++
                }
            }
            for (i in 1..m) {
                if (hasMonkey(i)) {
                    count++
                }
            }
            return count
        }
    }

    class Groups {
        var groups: Set<Group> = setOf()

        fun max(): Int {
            var i = 0
            groups.forEach {
                val size = it.getSize()
                if (i < size) {
                    i = size
                }
            }
            return i
        }

        fun remove(d: Int, removeMonkeyIndexes: Set<Int>) {
            val newGroups = mutableSetOf<Group>()
            groups.forEach { group ->
                val withoutDog = group.withoutDog(d)
                val withoutMonkeys = group.withoutMonkeys(removeMonkeyIndexes)
                newGroups.add(withoutMonkeys)
                newGroups.add(withoutDog)
            }
            groups = newGroups.filter {
                !newGroups.any { compare ->
                    (compare !== it) && compare.dogSet.containsAll(it.dogSet) && compare.monkeySet.containsAll(it.monkeySet)
                }
            }.toMutableSet()
        }

        init {
            val group = Group()
            for (i in 1..n) {
                group.addDog(i)
            }
            for (i in 1..m) {
                group.addMonkey(i)
            }
            groups = setOf(group)
        }
    }


    for (i in 1..l) {
        val (d, m) = readLine()!!.split(" ").map { it.toInt() }
        dogMonkeyMatrix.getOrPut(d) { mutableMapOf() }[m] = true
    }
    val groups = Groups()
    for (d1 in 1..n) {
        for (m2 in 1..m) {
            if (!dogMonkeyMatrix.getOrDefault(d1, mutableMapOf()).getOrDefault(m2, false)) {
                reversedDogMonkeyMatrix.getOrPut(d1) { mutableSetOf() }.add(m2)
            }
        }
        groups.remove(d1, reversedDogMonkeyMatrix.getOrDefault(d1, mutableSetOf()))
    }
    println(groups.max())
}