package day2

import java.io.File
import kotlin.math.abs

var list = listOf<List<Int>>()

fun main() {
    getInput("src/day2/input.txt")
    day2part1(list)
    day2part2(list)
}

fun getInput(input: String) {
    list = File(input).readLines()
        .map { line -> line.split(" ").map { it.toInt() } }
}

fun checkSafeness(report: List<Int>): Boolean {
    val repAsc = report == report.sorted()
    val repDesc = report == report.sortedDescending()
    val hasDiff = report.zipWithNext().all { (a, b) ->
        val diff = abs(a - b)
        diff in 1..3
    }
    return (repAsc || repDesc) && hasDiff
}