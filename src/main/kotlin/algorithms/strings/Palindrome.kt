package algorithms.strings

fun isPalindrome(input: String): Boolean {
    Regex("[^a-z0-9]").replace(input.lowercase(), "")
//    input.lowercase().filter { it.isLetterOrDigit() }
        .toCharArray().let {
            for (i in 0 until it.size / 2) {
                if (it[i] != it[it.size - 1 - i]) return false
            }
            return true
        }
}
