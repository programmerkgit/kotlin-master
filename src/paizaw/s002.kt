data class Point(val x: Int, val y: Int)

class RoadMap() {
    private val maps: MutableList<List<Int>> = mutableListOf()
    private fun isWall(x: Int, y: Int): Boolean {
        return maps[y][x] == 1
    }

    inner class Walk {
        var walkLength = 0
            private set
        var isFinished = false
            private set

        fun moveToNextPoints() {
            val nextPoints: MutableList<Point> = mutableListOf()
            currentPoints.forEach { point ->
                moveToNextPoint(point.x, point.y - 1, nextPoints)
                moveToNextPoint(point.x - 1, point.y, nextPoints)
                moveToNextPoint(point.x + 1, point.y, nextPoints)
                moveToNextPoint(point.x, point.y + 1, nextPoints)
            }
            currentPoints = nextPoints
            walkLength++
        }

        private fun movableTo(x: Int, y: Int): Boolean {
            if (outsideBound(x, y)) return false
            if (isWall(x, y)) return false
            if (isWalked(x, y)) return false
            return true
        }

        private fun moveToNextPoint(x: Int, y: Int, nextPoints: MutableList<Point>) {
            if (movableTo(x, y)) {
                if (goal.x == x && goal.y == y) {
                    isFinished = true
                }
                nextPoints.add(Point(x, y))
                markAsWalked(x, y)
            }
        }

        var currentPoints: MutableList<Point> = mutableListOf()
            private set
        private val movedPoints: MutableMap<Int, MutableMap<Int, Boolean>> = mutableMapOf()
        private fun markAsWalked(x: Int, y: Int) {
            movedPoints.getOrPut(x) { mutableMapOf() }[y] = true
        }

        private fun isWalked(x: Int, y: Int): Boolean {
            return movedPoints.getOrPut(x) { mutableMapOf() }.getOrDefault(y, false)
        }

        fun setStartPoint(point: Point) {
            currentPoints = mutableListOf(point)
            markAsWalked(point.x, point.y)
        }

    }

    private val start = object {
        var x = 0;
        var y = 0;
    }
    private val goal = object {
        var x = 0;
        var y = 0;
    }
    var w = 0
    var h = 0

    fun addRoad(roadRow: List<Int>) {
        maps.add(roadRow)
    }

    fun setStart(x: Int, y: Int) {
        start.x = x
        start.y = y
    }

    fun setGoal(x: Int, y: Int) {
        goal.x = x
        goal.y = y
    }

    fun outsideBound(x: Int, y: Int): Boolean {
        return !insideBound(x, y)
    }

    fun insideBound(x: Int, y: Int): Boolean {
        return 0 <= x && x <= w - 1 && 0 <= y && y <= h - 1
    }

    fun minMoveToGoal(): Int? {
        val walk = Walk()
        walk.setStartPoint(Point(start.x, start.y))
        while (walk.currentPoints.isNotEmpty()) {
            walk.moveToNextPoints()
            if (walk.isFinished) {
                return walk.walkLength
            }
        }
        return null
    }
}

fun main(args: Array<String>) {
    val roadMap = RoadMap()
    val (w, h) = readLine()!!.split(" ").map { it.toInt() }
    roadMap.w = w
    roadMap.h = h
    for (y in 0 until h) {
        val row = readLine()!!.split(" ").mapIndexed { x, it ->
            when (it) {
                "0" -> 0
                "1" -> 1
                "s" -> {
                    roadMap.setStart(x, y)
                    0
                }
                "g" -> {
                    roadMap.setGoal(x, y)
                    0
                }
                else -> throw Error("Unexpected")
            }
        }
        roadMap.addRoad(row)
    }
    val result = roadMap.minMoveToGoal()
    if (result == null) {
        println("Fail")
    } else {
        println(result)
    }
}