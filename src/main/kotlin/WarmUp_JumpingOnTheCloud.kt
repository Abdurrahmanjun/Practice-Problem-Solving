class WarmUp_JumpingOnTheCloud {

    // - learn loop using while conditon instead of fori
    // - while syntax help to handle re loop the array but the position can be modify
    // - everytime value in array position 0, increase count value
    // = if the next 2 position are still exist in array and the value if it is 0, increase position value

    fun solve(c: Array<Int>): Int {
        var count = -1
        var position = 0

        while (position < c.size) {
            if (c[position] == 0) {
                if (position + 2 < c.size && c[position+2] == 0) {
                    position++
                }
                count++
            }
            position++
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