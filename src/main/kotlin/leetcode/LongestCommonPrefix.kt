class Solution {
    // Input: strs = ["fl","flow","flight"]
    // Output: "fl"
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs[0].length == 0) {
            return ""
        }
        for (i in 1..(strs.size - 1)) {
            if (strs[i].length == 0) {
                return ""
            }
            var smallest = if (strs[0].length < strs[i].length) strs[0].length else strs[i].length
            var j = 0
            while (j < smallest) {
                if (strs[0][j] != strs[i][j]) break
                j++
            }
            strs[0] = strs[0].substring(0, j)
        }
        return strs[0]
    }
}
