package data_structures.stack.stack_using_linkedlist

import data_structures.Node
import data_structures.stack.StackContract

class Stack<T:Any> : StackContract<T> {

    private var top: Node<T>? = null
    private var bottom: Node<T>? = null
    private var length: Int = 0

    override fun peek(): T? {
        return top?.value
    }

    override fun push(element: T) {
        val newNode = Node(element)
        if (length == 0) {
            top = newNode
            bottom = newNode
        } else {
            newNode.next = top
            top = newNode
        }
        length++
    }

    override fun pop(): T? {
        if (length ==0) {
            return null
        } else if (length ==1) {
            bottom = null
        }
        val outputPop = top?.value
        top = top?.next
        length--
        return outputPop
    }

    override fun isEmpty(): Boolean {
        return length == 0
    }

    val lastElement : T?
        get() {
            if (length > 0) {
                return bottom?.value
            }
            return null
        }
}