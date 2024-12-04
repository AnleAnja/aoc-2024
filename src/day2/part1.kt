package day2

import kotlin.math.abs

fun day2part1(reports: List<List<Int>>): Int {
    val count = mutableListOf<Boolean>()
    reports.forEach { report ->
        val repAsc = report == report.sorted()
        val repDesc = report == report.sortedDescending()
        val hasDiff = report.zipWithNext().all { (a, b) ->
                val diff = abs(a - b)
                diff in 1..3
            }
            val safe = (repAsc || repDesc) && hasDiff
            count.add(safe)
    }
    return count.count { it }
}