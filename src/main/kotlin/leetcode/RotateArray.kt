package leetcode

class RotateArray {
    fun solution(nums: IntArray, k:Int): IntArray {
        var index = nums.size - 1 - k
        for (i in nums.indices) {
            if (index < k) {
                val temp = nums[i]
                nums[i] = nums[index]
                nums[i] = temp
                index++
            } else {
                break
            }
        }

        return nums
    }
}