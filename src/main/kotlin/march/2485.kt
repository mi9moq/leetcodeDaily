package march

fun pivotInteger(n: Int): Int {

    val arr = IntArray(n + 1)

    for (i in 1..n) {

        arr[i] = arr[i - 1] + i
    }

    val sum = arr[n]

    for (i in n + 1 downTo  (n + 1) / 2) {
        if (sum - arr[i-1] == arr[i]) return i
    }
    return -1
}