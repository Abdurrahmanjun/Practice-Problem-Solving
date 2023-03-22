package leetcode

class Palindrom {
    fun solution(x:Int) : Boolean {
        val str = x.toString()
        var fromBack = str.length-1
        for (i in 0 until str.length-1) {
            println("string $i ${str[i]} until string $fromBack ${str[fromBack]}")
            if(str[i] != str[fromBack]) {
                return false
            }
            fromBack--
        }
        return true
    }
}

fun main(args: Array<String>) {
    val leetCode = Palindrom()
    val output = leetCode.solution(101)
    println(output)
}