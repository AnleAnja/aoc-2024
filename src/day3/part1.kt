package day3

fun day3part1(input: String): Int {
    var valid = mutableListOf<String>()
    var result = 0
    val regexMul = Regex("mul\\((\\d{1,3}),(\\d{1,3})\\)")
    regexMul.findAll(input).forEach { valid.add(it.value) }
    val regexInt = Regex("\\d+")
    valid.forEach { formula ->
        var mul = 1
        regexInt.findAll(formula).forEach { mul *= it.value.toInt() }
        result += mul
    }
    return result
}