import kotlin.math.absoluteValue
import java.io.File

fun main() {
    var input = "src/input.txt"
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Int>()
    File(input).useLines { lines ->
        lines.forEach { line ->
            val parts = line.split("\\s+".toRegex())
            list1.add(parts[0].toInt())
            list2.add(parts[1].toInt())
        }
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