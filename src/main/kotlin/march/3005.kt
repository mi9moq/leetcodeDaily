package march

fun maxFrequencyElements(nums: IntArray): Int {

    val map = mutableMapOf<Int, Int>()
    var max = 0

    for (num in nums) {

        if (map.contains(num)){
            val temp = map[num]!! + 1
            map[num] = temp
            if (temp > max) max = temp
        } else {
            map[num] = 1
        }
    }

    if (max == 0) return nums.size
    var result = 0
    for ((key, value) in map) {
        if (value == max) result += max
    }

    return result
}