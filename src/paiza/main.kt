package paiza


data class History(
    val visited: List<Boolean>,
    val position: Int,
    val conditions: List<Boolean>
)

class Result(val cost: Int, val path: MutableList<Int>)

val Histories: MutableList<History> = mutableListOf()

val Stack: MutableList<Result> = mutableListOf()
fun main(args: Array<String>) {
    args.toList()
    val length = readLine()!!.toInt()
    val (f, b) = readLine()!!.split(" ").map { it.toInt() }
    val conditions = readLine()!!.map { it == 's' }

    fun calcCost(
        visited: List<Boolean>,
        cost: Int,
        conditions: List<Boolean>,
        position: Int,
        path: MutableList<Int>
    ) {
        /* Finished */
        if (visited.all { it } && position == visited.lastIndex) {
            Stack.add(Result(cost, path))
            return
        }
        /* Situation Already Experienced */
        if (Histories.find { it == History(visited, position, conditions) } != null) {
            return
        }
        /* Other Pattern */
        conditions.withIndex().forEach { (positionNext, c) ->
            if (positionNext != position && c) {
                val visitedNext = visited.toMutableList()
                visitedNext[positionNext] = true
                val pathNext = path.toMutableList()
                pathNext.add(positionNext)
                val costNext = cost + if (positionNext < position) b else f
                val conditionsNext = conditions.withIndex().map { (ci, c) ->
                    if (ci <= positionNext) {
                        c
                    } else {
                        !c
                    }
                }
                if (Stack.all { costNext < it.cost }) {
                    calcCost(visitedNext, costNext, conditionsNext, positionNext, pathNext)
                }
            }
        }
    }


    calcCost(MutableList(length) { false }, 0, conditions, length - 1, mutableListOf(length - 1))
    println(Stack.minBy { it.cost }?.path?.map { it + 1 }?.joinToString(" "))
}