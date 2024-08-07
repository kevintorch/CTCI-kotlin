package Ch_01_Arrays_And_Strings



/**
 * **URLify:**
 *
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters
 * and that you are given the "true" length of the string.
 *
 * ```
 * EXAMPLE
 * Input: "Mr John Smith      ", 13
 * Output: "Mr%20John%20Smith"
 * ```
 */

// O(N)
private fun encodeSpaces(charArray: CharArray, trueLength: Int) {
    var spaceCount = 0
    val trueLastIndex = trueLength - 1
    for (i in trueLastIndex downTo 0) {
        val ch = charArray[i]
        if (ch.isWhitespace()) {
            spaceCount++
        }
    }

    var index = trueLength + spaceCount * 2
    for (i in trueLastIndex downTo 0) {
        val ch = charArray[i]
        if (ch.isWhitespace()) {
            charArray[--index] = '0'
            charArray[--index] = '2'
            charArray[--index] = '%'
        } else {
            charArray[--index] = ch
        }
    }
}

private fun String.findTrueLength(): Int {
    for (i in lastIndex downTo 0) {
        val ch = this[i]
        if (!ch.isWhitespace()) {
            return i + 1
        }
    }
    return 0
}

fun main() {
    val input = "Mr John Smith       "
    val charArray = input.toCharArray()
    println(encodeSpaces(charArray, input.findTrueLength()))
    println(charArray.concatToString())
}
