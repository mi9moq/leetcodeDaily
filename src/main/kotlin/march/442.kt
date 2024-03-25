package march

fun findDuplicates(nums: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    for(num in nums){
        val index = Math.abs(num) - 1
        if(nums[index] > 0) nums[index] = -nums[index]
        else result.add(Math.abs(num))
    }
    return result
}