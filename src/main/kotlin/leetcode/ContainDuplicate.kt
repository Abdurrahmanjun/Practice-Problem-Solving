package leetcode

class ContainDuplicate {

    fun solution(nums : IntArray): Boolean {
        val map = HashSet<Int>()
        for (number in nums) {
            if (map.contains(number)) return true
            map.add(number)
        }

        return false
    }
}