class Question {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val output = IntArray(2)
        var map = HashMap<Int, Int>()

        for (i in nums.indices) {
            // if theres no hash value equals with target min item
            // than add another map pair
            if (map.containsKey(target - nums[i])) {
                output[0] = i
                output[1] = map.get(target - nums[i]) ?: 0
                return output
            }
            map.put(nums[i], i)
        }

        return output
    }
}

fun main() {
    val solution = Question()
    val arr = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
    println(arr.joinToString(separator = ","))
    // println("Hello, World!")
}
