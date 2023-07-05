package structures

class LinkedList<T> {
    var head: Node<T>? = null
        private set

    private var lastNodePointer: Node<T>? = null

    fun add(value: T) {
        val node = Node(value)
        head?.let {
            head = node
            lastNodePointer = node
        } ?: run {
            lastNodePointer?.next = node
            lastNodePointer = node
        }
    }

    fun print() {
        var curr = head
        while (curr != null) {
            print(curr.value.toString() + " ")
            curr = curr.next
        }
    }
}

class Node<T>(val value: T) {
    var next: Node<T>? = null
}
