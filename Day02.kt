import java.io.File

fun main() {

    val moves = mutableMapOf<String, Int>()


    fun part1(): Int {

        var horisontal: Int = 0
        var vertical: Int = 0

        val moves = readInput("Day02")

        moves.map {
            it.split(": ".toRegex(), 2)
        }.map {
            Pair(it.get(0), it.get(1).toInt())
        }.forEach { (direction, x) ->
            when (direction) {
                "forward" -> horisontal += x
                "down" -> vertical += x
                "up" -> vertical -= x
                else -> {
                }
            }
        }
//        File("Day02.txt").forEachLine {
//            println("horisontal: $horisontal and vertical: $vertical")
//            if (it.contains("forward")) {
//                var changeH = it.substring(it.length -1).toInt()
//                var horisontal = horisontal + changeH
//                println("changeH: $changeH and horisontal: $horisontal")
//                println("horisontal after: $horisontal and vertical after: $vertical")
//            } else if (it.contains("down")) {
//                var changeV = it.substring(it.length -1).toInt()
//                var vertical = vertical + changeV
//                println("changeV: $changeV and vertical: $vertical")
//                println("horisontal after: $horisontal and vertical after: $vertical")
//            } else if (it.contains("up")) {
//                var changeV = it.substring(it.length -1).toInt()
//                var vertical = vertical - changeV
//                println("changeV: $changeV and vertical: $vertical")
//                println("horisontal after: $horisontal and vertical after: $vertical")
//            }
//        }
        return horisontal * vertical


    }

    fun part2(): Int {

        var horisontal: Int = 0
        var vertical: Int = 0
        var aim: Int = 0

        val moves = readInput("Day02")

        moves.map {
            it.split(": ".toRegex(), 2)
        }.map {
            Pair(it.get(0), it.get(1).toInt())
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
