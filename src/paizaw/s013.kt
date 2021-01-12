package paizaw


class Result(val cost: Int, val path: MutableList<Int>)

var result: Result? = null

fun main(args: Array<String>) {
    val length = readLine()!!.toInt()
    val (f, b) = readLine()!!.split(" ").map { it.toInt() }
    /* Safe or Danger Conditions */
    val conditions = readLine()!!.map { it == 's' }

    fun calcCost(
        /**
         * Targets already visited
         * */
        visited: List<Boolean>,
        cost: Int,
        conditions: List<Boolean>,
        position: Int,
        routes: MutableList<Int>
    ) {
        /* Finished */
        if (visited.all { it } && position == visited.lastIndex) {
            if (result == null || result!!.cost > cost)
                result = Result(cost, routes)
            return
        }
        /* Other Pattern */
        conditions.withIndex().forEach { (nextPosition, condition) ->
            if (nextPosition != position && condition) {
                val nextVisited = visited.toMutableList()
                nextVisited[nextPosition] = true
                val nextRoutes = routes.toMutableList()
                nextRoutes.add(nextPosition)
                val nextCost = cost + if (nextPosition < position) b else f
                val nextConditions = conditions.withIndex().map { (ci, condition) ->
                    if (ci <= nextPosition) {
                        condition
                    } else {
                        !condition
                    }
                }
                if (result == null || result!!.cost > nextCost) {
                    calcCost(nextVisited, nextCost, nextConditions, nextPosition, nextRoutes)
                }
            }
        }
    }


    calcCost(MutableList(length) { false }, 0, conditions, length - 1, mutableListOf(length - 1))
    println(result!!.path.map { it + 1 }.joinToString(" "))
}