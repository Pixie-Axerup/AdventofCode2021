import java.io.File

fun main() {

    fun part1(): Int {

        var horisontal: Int = 0
        var vertical: Int = 0

        val moves: List<String> = File("Day02.txt").readLines()

        moves.map {
            Pair(it.substringBefore(": "), it.substringAfter(": ").toInt())
        }.forEach { (direction, x) ->
            when (direction) {
                "forward" -> horisontal += x
                "down" -> vertical += x
                "up" -> vertical -= x
                else -> {
                }
            }
        }
        return horisontal * vertical


    }

    fun part2(): Int {

        var horisontal: Int = 0
        var vertical: Int = 0
        var aim: Int = 0

        val moves: List<String> = File("Day02.txt").readLines()

        moves.map {
            Pair(it.substringBefore(": "), it.substringAfter(": ").toInt())
        }.forEach { (direction, x) ->
            when (direction) {
                "forward" -> {
                    horisontal += x
                    vertical += aim * x
                }
                "down" -> {
                    aim += x
                }
                "up" -> {
                    aim -= x
                }
                else -> {
                }
            }

        }
        return horisontal * vertical
    }

    println(part1())
    println(part2())

}
