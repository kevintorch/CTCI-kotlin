package Ch_01_Arrays_And_Strings

import Helper_Extensions.offsetBy
import java.util.*

/**
 * **Is Unique:**
 *
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 *
 */

// Naive Way with additional DS
// Time: O(n²), Space: O(1)
private fun isUniqueChars(str: String): Boolean {
    for (i in str.indices) {
        for (j in i + 1..<str.length) {
            if (str[i] == str[j]) return false
        }
    }
    return true
}

// using hash table DS
// Time: O(n), Space: O(n)
private fun isUniqueCharsUsingHashTable(str: String): Boolean {
    val table = HashSet<Char>()
    for (ch in str) {
        if (table.contains(ch)) return false
        table.add(ch)
    }
    return true
}

// using boolean array. Assuming Charset of length 128.
// Time: O(c), Space: O(c). Where c is the size of charset
private fun isUniqueCharsUsingBooleanArray(str: String): Boolean {
    val charset = BooleanArray(128)
    for (ch in str) {
        if (charset[ch.code]) return false
        charset[ch.code] = true
    }
    return true
}

// using bit vector. Assuming string has chars from a to z.
// Time: O(c), Space: O(c). Where c is the size of charset.
private fun isUniqueCharsUsingBitVector(str: String): Boolean {
    var checker = 0
    for (ch in str) {
        val value = ch.code - 'a'.code
        if ((checker and (1 shl value)) > 0) return false
        checker = checker or (1 shl value)
    }
    return true
}

// using sorting.
// Time: O(n log n), Space: O(1).
private fun isUniqueCharsUsingSorting(str: String): Boolean {
    if (str.length < 2) return true
    val charArray = str.toCharArray()
    Arrays.sort(charArray)
    var lag = str.first()
    for (i in charArray.indices.offsetBy(1)) {
        if (lag == charArray[i]) return false
        lag = charArray[i]
    }
    return true
}

fun main() {

    val words = arrayOf("abcde", "hello", "apple", "kite", "padle")

    println("Naive Way")
    for (word in words) {
        println(word + ": " + isUniqueChars(word))
    }
    println()

    println("With DS")
    for (word in words) {
        println(word + ": " + isUniqueCharsUsingHashTable(word))
    }
    println()

    println("With DS 2")
    for (word in words) {
        println(word + ": " + isUniqueCharsUsingBooleanArray(word))
    }
    println()

    println("With DS 3")
    for (word in words) {
        println(word + ": " + isUniqueCharsUsingBitVector(word))
    }
    println()

    println("With Sorting")
    for (word in words) {
        println(word + ": " + isUniqueCharsUsingSorting(word))
    }
    println()
}