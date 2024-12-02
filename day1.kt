import kotlin.math.absoluteValue

fun main() {
    var parse : String = ("3   4\n" +
            "4   3\n" +
            "2   5\n" +
            "1   3\n" +
            "3   9\n" +
            "3   3").trimIndent()
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Int>()
    parse.lines().forEach { line ->
        val parts = line.split("\\s+".toRegex())
        list1.add(parts[0].toInt())
        list2.add(parts[1].toInt())
    }
    list1.sort()
    list2.sort()
    var sum = 0
    for (i in list1.indices) {
        val diff = list1[i] - list2[i]
        sum += diff.absoluteValue
    }
    println(sum)
}