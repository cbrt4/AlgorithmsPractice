package algorithms.sort

import algorithms.randomInt
import algorithms.swap

fun <T : Comparable<T>> quickSort(input: Array<T>, start: Int = 0, end: Int = input.size) {
    if (end - start <= 1) {
        return
    } else {
        var middle = start
        val pivot = input[randomInt(start, end - 1)]
//        val pivot = input[(end - start + 1) / 2]
        for (i in start until end) {
            if (input[i] < pivot) {
                swap(input, i, middle)
                middle++
            }
        }
        quickSort(input, start, middle)
        quickSort(input, middle, end)
    }
}
