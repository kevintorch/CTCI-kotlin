package Ch_01_Arrays_And_Strings

import Helper_Extensions.sorted

/**
 * **Check Permutation:**
 *
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 */

// Naive Way
// Time: O(n²) and Space: O(1)
private fun permutation(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) return false
    for (c1 in s1) {
        if (!s2.contains(c1)) return false
    }
    return true
}


// Time: O(n) and Space: O(n)
private fun permutationWithDS(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) return false
    val table = HashMap<Char, Int>()
    for (ch in s1) {
        table[ch] = table[ch]?.plus(1) ?: 1
    }
    for (ch in s2) {
        table[ch] = table[ch]?.minus(1) ?: 0
        if (table[ch] == 0) table.remove(ch)
    }
    return table.isEmpty()
}

private fun permutationWithIntegerVector(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) return false

    val vector = IntArray(128)

    for (ch in s1) {
        vector[ch.code]++
    }

    for (ch in s2) {
        vector[ch.code]--
        if (vector[ch.code] < 0) return false
    }

    return true
}

private fun permutationWithSorting(a: String, b: String): Boolean {
    return a.sorted() == b.sorted()
}

fun main() {
    val pairs = arrayOf(arrayOf("apple", "papel"), arrayOf("carrot", "tarroc"), arrayOf("hello", "llloh"))
    for (pair in pairs) {
        val word1 = pair[0]
        val word2 = pair[1]
        val anagram: Boolean = permutationWithSorting(word1, word2)
        println("$word1, $word2: $anagram")
    }
}