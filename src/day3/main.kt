package day3

import java.io.File

var list = ""

fun main() {
    getInput("src/day3/input.txt")
    day3part1(list)
    day3part2(list)
}

fun getInput(input: String) {
    list = File(input).readText()
}

fun calculate(input: List<String>): Int {
    val regexInt = Regex("\\d+")
    var result = 0
    input.forEach { formula ->
        var mul = 1
        regexInt.findAll(formula).forEach { mul *= it.value.toInt() }
        result += mul
    }
    return result
}