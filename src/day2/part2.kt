package day2

fun day2part2(reports: List<List<Int>>): Int {
    val count = mutableListOf<Boolean>()
    reports.forEach { report ->
        var safe = checkSafeness(report)
        if (!safe) {
            safe = report.indices.any { i ->
                checkSafeness(report.filterIndexed { index, _ -> index != i })
            }
        }
        count.add(safe)
    }
    return count.count { it }
}

