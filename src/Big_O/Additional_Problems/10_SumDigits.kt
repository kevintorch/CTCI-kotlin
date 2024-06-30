package Big_O.Additional_Problems

/**
 * The following code sums the digits in a number. What is its big O time?
 *
 * O(log N)
 *
 * The runtime will be the number of digits in the number. A number with d digits can have a value up to 10ᵈ.
 * If n = 10ᵈ, then d = log n. Therefore, the runtime is O(log n).
 *
 */
private fun sumDigits(n: Int) : Int {
    var sum = 0
    var num = n
    while (n > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}