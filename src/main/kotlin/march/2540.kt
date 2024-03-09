package march

/**
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * return the minimum integer common to both arrays.
 * If there is no common integer amongst nums1 and nums2, return -1.
 **/

fun getCommon(nums1: IntArray, nums2: IntArray): Int {
    var first = 0
    var second = 0

    while (first < nums1.size && second < nums2.size) {

        val diff = nums1[first] - nums2[second]

        when {
            diff == 0 -> return nums1[first]
            diff > 0 -> second++
            else -> first++
        }
    }

    return -1
}