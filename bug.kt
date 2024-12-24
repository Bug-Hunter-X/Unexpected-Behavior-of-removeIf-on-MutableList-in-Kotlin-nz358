fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code intends to remove even numbers from the list, however it modifies the list during iteration which leads to unexpected behavior.  The elements at indices where even numbers were removed will shift causing the iterator to miss some elements.