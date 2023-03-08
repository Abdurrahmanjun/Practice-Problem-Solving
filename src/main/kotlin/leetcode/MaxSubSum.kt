package leetcode

class MaxSubSum {

    fun solution(nums: IntArray): Int {
        var maxSum = nums[0]
        var currSum = nums[0]
        var position = 1

        while (position <  nums.size) {

            if (currSum < 0) {
                currSum = 0
            }

            currSum += nums[position]
            maxSum = Math.max(maxSum, currSum)
            position++
        }

        return maxSum
    }
}