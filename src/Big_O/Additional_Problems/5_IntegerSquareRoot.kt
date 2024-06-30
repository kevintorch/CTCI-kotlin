package Big_O.Additional_Problems

/**
 * The following code computes the (integer) square root of a number.
 * If the number is not a perfect square (there is no integer square root), then it returns -1.
 * It does this by successive guessing. If n is 100, it first guesses SO. Too high?
 * Try something lower - halfway between 1 and SO. What is its runtime?
 *
 * O(log N).
 *
 * This algorithm is essentially doing a binary search to find the square root.
 * Therefore, the runtime is O(log n).
 *
 */
private fun sqrt(n: Int): Int {
    return sqrtHelper(n, 1, n)
}

private fun sqrtHelper(n: Int, min: Int, max: Int): Int {
    if (max < min) return -1

    val guess = min + max / 2

    if (guess * guess == n) {
        return guess
    }
    if (guess * guess < n) {
        return sqrtHelper(n, guess + 1, max)
    }
    return sqrtHelper(n, min, guess - 1)
}