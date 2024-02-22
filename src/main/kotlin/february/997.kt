package february

fun findJudge(n: Int, trust: Array<IntArray>): Int {

    val arr = IntArray(n + 1) { 0 }

    for (pair in trust) {

        arr[pair[0]]--
        arr[pair[1]]++
    }

    for (i in 1 .. n) {
        if (arr[i] == n - 1) return i
    }

    return - 1
}