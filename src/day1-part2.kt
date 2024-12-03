fun day1part2 (list1: MutableList<Int>, list2: MutableList<Int>): Int {
    var similarity = 0
    list1.forEach { number ->
        var occurence = list2.count { it == number }
        similarity += occurence * number
    }
    return similarity
}