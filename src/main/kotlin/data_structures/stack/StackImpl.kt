package data_structures.stack

import data_structures.stack.stack_using_array.Stack as StackArray
import data_structures.stack.stack_using_linkedlist.Stack as StackLinkedList

fun String.validParentheses(stackArray : StackContract<Char>): Boolean {

    for (char in this) {
        when (char) {
            '(' -> stackArray.push(char)
            ')' -> {
                if (stackArray.isEmpty()) return false
                stackArray.pop()
            }
        }
    }

    return stackArray.isEmpty()
}

fun main() {
    println(")((())))".validParentheses(StackArray()))
    println(")((())))".validParentheses(StackLinkedList()))
}