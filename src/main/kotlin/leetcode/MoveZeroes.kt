package leetcode

class MoveZeroes {
    fun solution(nums : IntArray): IntArray {
        var index = 0
        for (number in nums) {
            if (number !=0) {
                nums[index] = number
                index++
            }
        }
        for (i in index until  nums.size - 1) {
            nums[i] = 0
        }

        return nums
    }

    fun solutionSwap(nums : IntArray): IntArray {
        var index = -1
        for (i in nums.indices) {
            if (nums[i] == 0 && index == -1) {
                index = i
            }
            // "index != -1" to avoid error ArrayIndexOutOfBoundsException: -1
            else if(nums[i] != 0 && index != -1){
                nums[index] = nums[i]
                nums[i] = 0
                index++
            }
        }
        return nums
    }
}

fun main(args: Array<String>) {
    val moveZeroes = MoveZeroes()
    moveZeroes.solutionSwap(intArrayOf(0,1,0,3,12))
}