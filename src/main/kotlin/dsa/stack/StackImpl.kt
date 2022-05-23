package dsa.stack

class StackImpl<T:Any> : Stack<T>{

    private var storage = arrayListOf<T>()

    override fun push(element:T) {
        storage.add(element)
    }

    override fun pop(): T? {
        return storage.removeLastOrNull()
    }

    override fun isEmpty(): Boolean {
        return storage.isEmpty()
    }
}

fun String.validParentheses(): Boolean {

    val stack = StackImpl<Char>()

    for (char in this) {
        when (char) {
            '(' -> stack.push(char)
            ')' -> {
                if (stack.isEmpty()) return false
                stack.pop()
            }
        }
    }

    return stack.isEmpty()
}

fun main() {
    println(")(((())))".validParentheses())
}