package dkatalis

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val array1 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val array2 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val deliveryArrangement = DeliveryArrangement()
    println(deliveryArrangement.solve(n,array1,array2).joinToString(""))
//    3
//    3 2 1
//    1 3 2
}

class DeliveryArrangement {
    // - create hash map to get pair key and value
    // - loop array1 times
    // - meanwhile looping, check the priority list

    fun solve(n: Int, array1: Array<Int>, array2: Array<Int>) : ArrayList<Int> {

        val deliveries : HashMap<Int, Int> = HashMap()
        val result: ArrayList<Int> = ArrayList()

        for (i in 1..n) {
            deliveries[i] = 0
        }

        for (i in 0 until n) {
            if (deliveries[array1[i]] == 0) {
                deliveries[array1[i]] = 1
                innerloop@ for (j in i until n) {
                    if (array2[j] == array1[i]) {
                        continue
                    } else if (deliveries[array2[j]] == 0) {
                        deliveries[array2[j]] = 2
                        break@innerloop
                    }
                }
            }
        }

        for ((_, value) in deliveries) {
            result.add(value)
        }

        return result
    }
}