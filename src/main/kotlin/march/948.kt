package march

fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
    tokens.sort()
    var score = 0
    var p = power

    var left = 0
    var right = tokens.size - 1
    while (true) {
        val diff = right - left
        when {
            diff < 0 -> break
            p >= tokens[left] -> {
                p -= tokens[left]
                left++
                score++
            }
            score > 0 && diff > 0 -> {
                p += tokens[right]
                right--
                score--
            }
            else -> break
        }
    }

    return score
}