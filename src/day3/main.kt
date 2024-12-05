package day3

import java.io.File

var list = ""

fun main() {
    getInput("src/day3/input.txt")
    println(day3part1(list))
}

fun getInput(input: String) {
    list = File(input).readText()
}