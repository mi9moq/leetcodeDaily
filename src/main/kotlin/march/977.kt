package march

import kotlin.math.abs


fun sortedSquares(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var left = 0
    var right = nums.lastIndex
    var index = nums.lastIndex

    while (left <= right) {
        if (abs(nums[left]) > abs(nums[right])) {
            result[index--] = nums[left] * nums[left++]
        } else {
            result[index--] = nums[right] * nums[right--]
        }
    }

    return result
}