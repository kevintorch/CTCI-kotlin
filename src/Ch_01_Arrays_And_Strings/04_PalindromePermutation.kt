package Ch_01_Arrays_And_Strings

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 *
 * ```
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat"; "atco eta"; etc.)
 * ```
 *
 *
 */

// O(N)
private fun isPermutationOfPalindrome(phrase: String) : Boolean {
    val table = createCharacterTable(phrase)
    return checkMaxOneOdd(table)
}

private fun checkMaxOneOdd(table: HashMap<Char, Int>): Boolean {
    var foundOdd = false
    for (entry in table) {
        if (entry.value % 2 == 1) {
            if (foundOdd) {
                return false
            }
            foundOdd = true
        }
    }
    return true
}

private fun createCharacterTable(s: String): HashMap<Char, Int> {
    val table = HashMap<Char, Int>()
    for (ch in s) {
        if (table[ch] == null) {
            table[ch] = 1
        } else {
            table[ch] = table[ch]!!.plus(1)
        }
    }
    return table
}

fun main() {

    val l = arrayListOf(8, 8)
    l.set(0, 5)
    println(l.toString())

}