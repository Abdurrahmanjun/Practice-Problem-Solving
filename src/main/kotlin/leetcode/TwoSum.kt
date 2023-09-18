package leetcode

/**
 * may assume each input only have exactly one solution
 *
 * @param nums integer array input
 * @param target integer target sum
 * @return Single IntArray with contain only 2 elements, element represent position
 */
class TwoSum {

    fun solution(nums: IntArray, target: Int): IntArray {
        var i = 0
        val map = HashMap<Int, Int>()
        val output = IntArray(2)

        while (i < nums.size) {
            if (map.containsKey(target - nums[i])) {
                output[1] = i
                output[0] = map.get(target - nums[i])!!
                break
            }
            map.put(nums[i], i)
            i++
        }
        return output
    }

    fun solutionArrayList(nums: IntArray, target: Int): ArrayList<Int> {
        var i = 0
        val map = HashMap<Int, Int>()
        val output = ArrayList<Int>()

        while (i < nums.size) {
            if (map.containsKey(target - nums[i])) {
                output.add(map.get(target - nums[i])!!)
                output.add(i)
            }
            map.put(nums[i], i)
            i++
        }
        return output
    }
}

fun main() {
    val twoSum = TwoSum()
    val output = twoSum.solution(intArrayOf(1, 2, 3, 4, 5, 6, 7), 8)
    val outputSolutionArrayList = twoSum.solutionArrayList(intArrayOf(1, 2, 3, 4, 5, 6, 7), 8)
    println(output.joinToString())
    println(outputSolutionArrayList.joinToString())
}
