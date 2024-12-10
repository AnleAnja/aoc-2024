package day4

val keyword = charArrayOf('X', 'M', 'A', 'S')

fun day4part1(input: String): Int {
    val matrix = input.lines().map { it.toCharArray() }
    var sum = 0
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] == keyword[0]) {
                val directions = listOf(
                    Pair(0, -1),
                    Pair(1, -1),
                    Pair(-1, -1),
                    Pair(1, 0),
                    Pair(-1, 0),
                    Pair(0, 1),
                    Pair(1, 1),
                    Pair(-1, 1)
                )
                for (direction in directions) {
                    if (searchWithIndices(matrix, i, j, 0, direction)) {
                        sum++
                    }
                }
            }
        }
    }
    return sum
}

fun searchWithIndices(matrix: List<CharArray>, i: Int, j: Int, index: Int, direction: Pair<Int,Int>): Boolean {
    val (n, m) = direction
    if (i !in matrix.indices || j !in matrix[i].indices) return false
    if (matrix[i][j] != keyword[index]) {
        return false
    }
    if (index == keyword.size - 1) return true
    return searchWithIndices(matrix, i + n, j + m, index + 1, direction)
}