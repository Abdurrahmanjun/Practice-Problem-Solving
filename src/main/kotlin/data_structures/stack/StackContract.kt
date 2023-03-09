package data_structures.stack

interface StackContract<T:Any> {
    fun peek(): T?
    fun push(element:T)
    fun pop(): T?
    fun isEmpty() : Boolean
}