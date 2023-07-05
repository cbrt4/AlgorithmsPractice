package algorithms.search

fun <T : Comparable<T>> binarySearch(sortedList: List<T>, value: T): Int {
    var left = 0
    var right = sortedList.size - 1
    var middle: Int

    while (left <= right) {
        middle = (left + right) / 2
        when {
            sortedList[middle] == value -> return middle
            sortedList[middle] > value -> right = middle - 1
            else -> left = middle + 1
        }
    }

    return -1
}
