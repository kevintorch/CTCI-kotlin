package Big_O.Additional_Problems

/**
 *  0(kcᵏ), where k is the length of the string and c is the number of characters in the alphabet.
 *
 *  It takes 0(cᵏ) time to generate each string. Then, we need to check that each of these is sorted, which takes O(k) time.
 *
 */
private const val numChars = 26

private fun printSortedStrings(remaining: Int) {
    printSortedStrings(remaining, "")
}

private fun printSortedStrings(remaining: Int, prefix: String) {
    if (remaining == 0) {
        if (isInOrder(prefix)) {
            println(prefix)
        }
    } else {
        for (i in 0..<numChars) {
            val c = ithLetter(i)
            printSortedStrings(remaining - 1, prefix + c)
        }
    }
}

private fun isInOrder(s: String): Boolean {
    for (i in 1..<s.length) {
        val prev = ithLetter(s[i - 1].code)
        val curr = ithLetter(s[i].code)
        if (prev > curr) return false
    }
    return true
}

fun ithLetter(i: Int): Char {
    return ('a'.code + i).toChar()
}