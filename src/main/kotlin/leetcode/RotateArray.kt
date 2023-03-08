package leetcode

class RotateArray {
    fun solution(nums: IntArray, k:Int): IntArray {
        val move = k % nums.size
        println("move $move")

        swap(nums,0,nums.lastIndex)
        swap(nums,0,move - 1)
        swap(nums,move,nums.lastIndex)

        return nums
    }

    private fun swap(nums: IntArray, start:Int, end:Int) {
        var mStart = start
        var mEnd = end
        if (nums.size > 1) {
            while (mStart <= mEnd) {
                println("start $mStart - end $mEnd")
                val temp = nums[mStart]
                nums[mStart] = nums[mEnd]
                nums[mEnd] = temp
                mStart++
                mEnd--
            }
        }
        println("nums ${nums.joinToString(", ")}")
    }
}

fun main(args: Array<String>) {
    val rotateArray = RotateArray()
    rotateArray.solution(intArrayOf(1,2,3,4,5,6,7),3)
}