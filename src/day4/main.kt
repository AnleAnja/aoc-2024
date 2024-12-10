package day4

import java.io.File

var text = ""
fun main() {
    getInput("src/day4/input.txt")
    println(day4part1(text))
}

fun getInput(input: String) {
    text = File(input).readText()
}