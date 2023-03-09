package data_structures.queue

interface QueueContract<T:Any> {
    fun peek(): T?
    fun enqueue(element:T)
    fun dequeue(): T?
}