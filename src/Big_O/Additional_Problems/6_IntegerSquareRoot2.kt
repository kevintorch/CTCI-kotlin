package Big_O.Additional_Problems

/**
 * The following code computes the (integer) square root of a number.
 * If the number is not a perfect square (there is no integer square root), then it returns -1.
 * It does this by trying increasingly large numbers until it finds the right value (or is too high). What is its runtime?
 *
 * O(√n) or O(sqrt(n)).
 *
 * This is just a straightforward loop that stops when guess * guess > n (or, in other words, when guess > sqrt(n)).
 *
 */
private fun sqrt(n: Int): Int {
    var guess = 1
    while (guess * guess <= n) {
        if (guess * guess == n) {
            return guess
        }
        guess++
    }
    return -1
}