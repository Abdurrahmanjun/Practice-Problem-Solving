package data_structures.stack.stack_using_array

import data_structures.stack.StackContract

class Stack<T:Any> : StackContract<T> {

    private var stackArray = arrayListOf<T>()

    override fun peek(): T {
        return stackArray[stackArray.lastIndex]
    }

    override fun push(element: T) {
        stackArray.add(element)
    }

    override fun pop(): T? {
        return stackArray.removeLastOrNull()
    }

    override fun isEmpty(): Boolean {
        return stackArray.isEmpty()
    }
}