fun main() {

    val depth = readInput("Day01")

    fun part1(): Int {
        return depth.map {
            it.toInt()
        }
            .zipWithNext()
            .count {
                    (first, second) -> second > first
            }


    }

    fun part2(): Int {
        return depth.asSequence()
            .map {
                it.toInt()
            }
            .windowed(3)
            .map {
                it.sum()
            }
            .zipWithNext()
            .count {
                    (first, second) -> second > first
            }
    }

    println(part1())
    println(part2())
}
