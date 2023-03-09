package data_structures.queue.queue_using_array

import data_structures.queue.QueueContract

class Queue<T:Any> : QueueContract<T> {

    var queueArray = arrayListOf<T>()

    override fun peek(): T {
        return queueArray[0]
    }

    override fun enqueue(element: T) {
        queueArray.add(element)
        check()
    }

    override fun dequeue(): T? {
        return queueArray.removeFirstOrNull()
    }

    fun check() {
        println("array :  ${queueArray.joinToString(" ")} ")
    }
}