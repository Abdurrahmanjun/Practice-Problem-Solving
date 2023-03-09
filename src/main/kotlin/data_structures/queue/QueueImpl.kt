package data_structures.queue

import data_structures.queue.queue_using_linkedlist.Queue as QueueLinkedList
import data_structures.queue.queue_using_array.Queue as QueueArray

fun main(args: Array<String>) {
    val queue : QueueLinkedList<String> = QueueLinkedList<String>()
    queue.enqueue("joy")
    queue.enqueue("matt")
    queue.enqueue("pavel")
    queue.enqueue("Jun")
    queue.dequeue()
    queue.check()

    println()
    println()

    val queue2 : QueueArray<String> = QueueArray<String>()
    queue2.enqueue("joy")
    queue2.enqueue("matt")
    queue2.enqueue("pavel")
    queue2.enqueue("Jun")
    queue2.dequeue()
    queue2.check()

}