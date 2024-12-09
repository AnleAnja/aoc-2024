package day3

fun day3part2(input: String): Int {
    val valid = mutableListOf<String>()
    val regexEnabled = Regex("(?s)don't\\(\\)(?:[^d]++|d(?!o\\(\\)))*+(?:do\\(\\)|${'$'})")
    val enabled = input.replace(regexEnabled, "")
    val regexMul = Regex("mul\\((\\d{1,3}),(\\d{1,3})\\)")
    regexMul.findAll(enabled).forEach { valid.add(it.value) }
    return calculate(valid)
}