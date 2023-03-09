package zzz.vidio

class Print_Binary_Square {

    fun print_binary_square(input: Int) {
        for (i in 1..input) {
            for (j in 1..input) {
                if (i%2 !=0 && j%2 !=0) {
                    print("0")
                } else if (i%2 !=0 && j%2 ==0) {
                    print("1")
                } else if (i%2 ==0 && j%2 ==0) {
                    print("0")
                } else if (i%2 ==0 && j%2 !=0) {
                    print("1")
                }
            }
            println()
        }
    }
}

fun main(args: Array<String>) {
    val palindrom = Print_Binary_Square()
    palindrom.print_binary_square(2)
    palindrom.print_binary_square(5)
}