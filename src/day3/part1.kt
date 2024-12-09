package day3

fun day3part1(input: String): Int {
    val valid = mutableListOf<String>()
    val regexMul = Regex("mul\\((\\d{1,3}),(\\d{1,3})\\)")
    regexMul.findAll(input).forEach { valid.add(it.value) }
    return calculate(valid)
}