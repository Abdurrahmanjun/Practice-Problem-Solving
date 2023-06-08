package leetcode

class RotateArray {
    fun solution(nums: IntArray, k:Int): IntArray {
        val move = k % nums.size
        println("move $move")

        swap(nums,0,nums.lastIndex)     // 7,6,5,4,3,2,1
        swap(nums,0,move - 1)      // 5,6,7,4,3,2,1
        swap(nums,move,nums.lastIndex)        // 5,6,7,1,2,3,4

        println(nums.joinToString(separator = ", "))
        return nums
    }

    private fun swap(nums: IntArray, start:Int, end:Int) {
        var mStart = start
        var mEnd = end
        if (nums.size > 1) {
            while (mStart <= mEnd) {
                // println("start $mStart - end $mEnd")
                val temp = nums[mStart]
                nums[mStart] = nums[mEnd]
                nums[mEnd] = temp
                mStart++
                mEnd--
            }
        }
        // println("nums ${nums.joinToString(", ")}")
    }

    fun solution2(nums2 : IntArray,k: Int) {
        val arr = IntArray(nums2.size)
        for (i in 0..nums2.size - 1) {
            arr[(i + k) % nums2.size] = nums2[i]
        }
        println(arr.joinToString(separator = ", "))
    }

    // this one came after delloite interview
    fun solution3(a : IntArray, k: Int) : IntArray{
        val b = IntArray(a.size % k)
        var c = IntArray(k)
        if (k > a.size) {
            c = IntArray(a.size % k)
        } else {
            c = IntArray(k)
        }
        var counterForC = 0
        println(a.size)
        println(b.size)
        println(c.size)

        for (i in 0 .. a.size % k -1) {
            b[i] = a[i]
        }

        for (j in a.size % k .. a.size - 1) {
            c[counterForC] = a[j]
            counterForC++
        }

        println(c.plus(b).joinToString())
        return b.plus(c)
    }
}

fun main(args: Array<String>) {
    val rotateArray = RotateArray()
    rotateArray.solution(intArrayOf(1,2,3,4,5,6,7),3)
    // rotateArray.solution3(intArrayOf(1,2,3,4,5,6,7),3)
}