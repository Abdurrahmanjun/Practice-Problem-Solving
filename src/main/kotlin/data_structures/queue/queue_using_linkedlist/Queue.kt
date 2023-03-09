package data_structures.queue.queue_using_linkedlist

import data_structures.Node
import data_structures.queue.QueueContract

class Queue<T:Any> : QueueContract<T> {

    private var first : Node<T>? = null
    private var last : Node<T>? = null
    private var  length : Int = 0

    override fun peek(): T? {
        return last?.value
    }

    override fun enqueue(element: T) {
        val newNode = Node(element)
        if (length == 0) {
            first = newNode
            last = newNode
        } else {
            last?.next = newNode
            last = newNode
        }
        check()
        length++
    }

    override fun dequeue(): T? {
        if (length > 0) {
            first = first?.next
            if (length == 1) {
                last = null
            }
            length--
        }
        return null
    }

    fun check() {
        println("first :  ${first.toString()} ")
        println("last :  ${last.toString()}")
    }
}