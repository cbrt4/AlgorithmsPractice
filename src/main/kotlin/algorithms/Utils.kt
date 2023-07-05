package algorithms

fun <T : Comparable<T>> swap(input: Array<T>, from: Int, to: Int) {
    val cache = input[from]
    input[from] = input[to]
    input[to] = cache
}

fun randomInt(from: Int, to: Int) = from + (Math.random() * (to - from + 1)).toInt()
