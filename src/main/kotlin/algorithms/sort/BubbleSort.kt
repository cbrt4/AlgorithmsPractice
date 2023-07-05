package algorithms.sort

import algorithms.swap

fun <T : Comparable<T>> bubbleSort(input: Array<T>) {
    for (i in 1 until input.size) {
        for (j in 0..i) {
            if (input[j] > input[i]) {
                swap(input, i, j)
            }
        }
    }
}
