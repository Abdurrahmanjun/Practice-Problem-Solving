class WarmUp_CountingValleys {
    // Write your code here
    // - learn for loop with condition

    fun solve(steps: Int, path: String): Int {
        var level = 0
        var valley = 0

        for (item in path.toCharArray()) {
            if (item.equals('U')) {
                level++
            } else {
                level--
            }

            if (level == 0 && item.equals('U')) {
                valley++
            }
        }

        return valley
    }

}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val countingValleys = WarmUp_CountingValleys()
    println(countingValleys.solve(steps,path))
}