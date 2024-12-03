import kotlin.math.absoluteValue
import java.io.File

fun day1part1(list1: MutableList<Int>, list2: MutableList<Int>): Int {
    var sum = 0
    for (i in list1.indices) {
        val diff = list1[i] - list2[i]
        sum += diff.absoluteValue
    }
    return sum
}