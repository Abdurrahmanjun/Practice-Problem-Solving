class WarmUp_RepeatedString {

    fun solve2(s: String, n: Long): Long {
        var count : Long = 0
        val arrayChar = s.toMutableList()

        if (s.count() == 1 && s == "a") {
            count = n
        }
        else if (n < s.count().toLong()) {
            for (i in 0 until n ) {
                if (arrayChar[i.toInt()] == 'a') {
                    count++
                }
            }
        }
        else if (n > s.count().toLong()) {
            for (i in 0 until n - s.count().toLong()) {
                arrayChar.add(arrayChar[i.toInt()])
            }

            for (item in arrayChar) {
                if (item == 'a') {
                    count++
                }
            }
        }

        return count
    }

    fun solve(s: String, n: Long): Long {
        val repeatedTimes = n / s.length
        val modChar = n % s.length
        var aCounterInString = 0
        var aCounterInModString = 0

        for (i in 0 until s.length ) {
            if (s[i] == 'a') {
                aCounterInString++
            }
        }

        for (i in 0 until modChar ) {
            if (s[i.toInt()] == 'a') {
                aCounterInModString++
            }
        }

        return repeatedTimes * aCounterInString + aCounterInModString
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val repeatedString = WarmUp_RepeatedString()
    println(repeatedString.solve(s, n))
}