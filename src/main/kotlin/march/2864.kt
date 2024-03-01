package march

fun maximumOddBinaryNumber(s: String): String = s.count { it == '1' }.let {
    "1".repeat(it - 1) + "0".repeat(s.length - it) + "1"
}