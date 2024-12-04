package day2

import java.io.File

var list = listOf<List<Int>>()

fun main() {
    getInput("src/day2/input.txt")
    println(day2part1(list))
}

fun getInput(input: String) {
    list = File(input).readLines()
        .map { line -> line.split(" ").map { it.toInt() } }
}