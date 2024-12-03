import java.io.File

var list1 = mutableListOf<Int>()
var list2 = mutableListOf<Int>()

fun main() {
    getInput("src/input.txt")
    day1part1(list1, list2)
}

fun getInput(input: String) {
    File(input).useLines { lines ->
        lines.forEach { line ->
            val parts = line.split("\\s+".toRegex())
            list1.add(parts[0].toInt())
            list2.add(parts[1].toInt())
        }
    }
    list1.sort()
    list2.sort()
}