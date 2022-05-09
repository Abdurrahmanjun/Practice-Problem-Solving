class PZN_Palindrom {

    fun isPalindrom(string: String) : Boolean {
        for (i in 0 until string.length / 2) {
            println("["+i+"] "+string[i].toChar() +" = ["+(string.length - i - 1)+"] "+string[string.length - i - 1].toChar())
            if (string[i].toChar() != string[string.length - i - 1].toChar()) {
                return false
            }
        }

        return true
    }

    fun isPalindromWithRecursiveApproach(string: String, position: Int) : Boolean {
        if (position < string.length / 2) {
            if (string[position].toChar() != string[string.length - position - 1].toChar()) {
                return false
            } else {
                isPalindromWithRecursiveApproach(string, position + 1)
            }
        }

        return true
    }
}

fun main(args: Array<String>) {
    val palindrom = PZN_Palindrom()
    println(palindrom.isPalindrom("kodok"))
    println(palindrom.isPalindromWithRecursiveApproach("ayam",0))
}