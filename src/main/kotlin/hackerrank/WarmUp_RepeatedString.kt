package hackerrank

class WarmUp_RepeatedString {

    // - use solve function,
    // - instead of multiple and count, we can count and multiple due to the possibility of 25% for of the test cases use n <= 10 power of 6
    // - first loop will count how many a's in full string
    // - second loop will count how many a's in string after modulus calculation has been perform

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