package leetcode

class Solution {
    fun romanToInt(s: String): Int {
        var output = 0
        var nextItem = '-'
        for (i in 0..s.length - 1) {
            // on last item the item of nextItem and last item should be the same
            if (i != s.length - 1) {
                nextItem = s[i + 1]
            }
            when (s[i]) {
                'I' -> if (nextItem == 'V' || nextItem == 'X') output -= 1 else output += 1
                'V' -> output += 5
                'X' -> if (nextItem == 'L' || nextItem == 'C') output -= 10 else output += 10
                'L' -> output += 50
                'C' -> if (nextItem == 'D' || nextItem == 'M') output -= 100 else output += 100
                'D' -> output += 500
                'M' -> output += 1000
            }
        }
        return output
    }
}

fun main() {
    val solution = Solution()
    val output = solution.romanToInt("MCMXCIV")
    println(output)
}
