package algorithms.sort

fun <T : Comparable<T>> mergeSort(input: List<T>): List<T> = if (input.size <= 1) input else {
    val middle = input.size / 2
    val left = input.subList(0, middle)
    val right = input.subList(middle, input.size)

    merge(mergeSort(left), mergeSort(right))
}

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    var indexLeft = 0
    var indexRight = 0
    val sorted = mutableListOf<T>()

    while (indexLeft < left.size || indexRight < right.size) {
        when {
            indexLeft >= left.size -> {
                sorted.add(right[indexRight])
                ++indexRight
            }

            indexRight >= right.size -> {
                sorted.add(left[indexLeft])
                ++indexLeft
            }

            left[indexLeft] >= right[indexRight] -> {
                sorted.add(right[indexRight])
                ++indexRight
            }

            else -> {
                sorted.add(left[indexLeft])
                ++indexLeft
            }
        }
    }

    return sorted
}
