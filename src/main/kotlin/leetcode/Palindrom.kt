package leetcode

class Palindrom {
    fun solution(x: Int): Boolean {
        val str = x.toString()
        var fromBack = str.length - 1
        for (i in 0 until str.length - 1) {
            println("string $i ${str[i]} until string $fromBack ${str[fromBack]}")
            if (str[i] != str[fromBack]) {
                return false
            }
            fromBack--
        }
        return true
    }
}

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val xString = x.toString()
        for (i in 0..xString.length - 1) {
            // if those two character not equals, break, return false
            if (xString[i] != xString[xString.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    val leetCode = Palindrom()
    val output = leetCode.solution(101)
    println(output)
}
