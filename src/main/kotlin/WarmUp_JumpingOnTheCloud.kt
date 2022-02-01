class WarmUp_JumpingOnTheCloud {
    // Write your code here
    // - lear loop using while conditon instead of fori

    fun solve(c: Array<Int>): Int {
        var count = -1
        var item = 0

        while (item < c.size) {
            if (c[item] == 0) {
                if (item + 2 < c.size && c[item+2] == 0) {
                    item++
                }
                count++
            }
            item++
        }

        return count
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val jumpingOnTheCloud = WarmUp_JumpingOnTheCloud()
    println(jumpingOnTheCloud.solve(c))
}