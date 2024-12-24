fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        if (element % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)
}

This code uses an iterator to remove even numbers.  The iterator's `remove()` function safely removes the current element without affecting the iteration process.