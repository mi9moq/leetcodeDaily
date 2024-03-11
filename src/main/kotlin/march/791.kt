package march

fun customSortString(order: String, s: String): String {
    val result = StringBuilder()
    val builders = Array(26) { StringBuilder() }

    for (c in s) {
        builders[c - 'a'].append(c)
    }

    for (c in order) {
        result.append(builders[c - 'a'])
        builders[c - 'a'].setLength(0)
    }

    for (b in builders) {
        result.append(b)
    }

    return result.toString()
}