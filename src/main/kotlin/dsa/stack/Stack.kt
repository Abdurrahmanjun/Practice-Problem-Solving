package dsa.stack

interface Stack<T:Any> {

    fun push(element:T)
    fun pop(): T?
    fun isEmpty() : Boolean
}