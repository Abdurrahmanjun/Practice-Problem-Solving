import java.util.LinkedList

class SolutionValidParenthess {
    fun isValidArrayList(s: String): Boolean {
        val stack = ArrayList<Char>()

        for (i in 0 until s.length) {
            when (s[i]) {
                '(' -> stack.add(s[i])
                '{' -> stack.add(s[i])
                '[' -> stack.add(s[i])
                ')' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val temporary = stack.removeAt(stack.size - 1)
                    if (!temporary.equals('(')) {
                        return false
                    }
                }
                '}' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val temporary = stack.removeAt(stack.size - 1)
                    if (!temporary.equals('{')) {
                        return false
                    }
                }
                ']' -> {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val temporary = stack.removeAt(stack.size - 1)
                    if (!temporary.equals('[')) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }

    fun isValidLinkedList(s: String): Boolean {
        val stack = LinkedList<Char>()

        for (i in 0 until s.length) {
            when (s[i]) {
                '(', -> stack.push(s[i])
                '{' -> stack.push(s[i])
                '[' -> stack.push(s[i])
                ')' -> {
                    if (stack.isEmpty()) return false
                    val temporary = stack.pop()
                    println(temporary)
                    println(s[i])
                    if (temporary != '(') {
                        return false
                    }
                }
                '}' -> {
                    if (stack.isEmpty()) return false
                    val temporary = stack.pop()
                    println(temporary)
                    println(s[i])
                    if (temporary != '{') {
                        return false
                    }
                }
                ']' -> {
                    if (stack.isEmpty()) return false
                    val temporary = stack.pop()
                    println(temporary)
                    println(s[i])
                    if (temporary != '[') {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}

fun main() {
    val solution = SolutionValidParenthess()
    val outputIsValidArrayList = solution.isValidArrayList("(]")
    println(outputIsValidArrayList)
    println()
    val outputIsValidLinkedList = solution.isValidLinkedList("(]")
    println(outputIsValidLinkedList)
}
