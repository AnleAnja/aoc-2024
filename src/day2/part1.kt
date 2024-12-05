package day2

fun day2part1(reports: List<List<Int>>): Int {
    val count = mutableListOf<Boolean>()
    reports.forEach { report ->
        count.add(checkSafeness(report))
    }
    return count.count { it }
}