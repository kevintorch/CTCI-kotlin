package Big_O.Examples_And_Excercises

/**
 * The following code computes n! (n factorial).
 *
 * This is just a straight recursion from n to n-1 to n-2 down to 1. It will take O(n) time.
 */
private fun factorial(n: Int) : Int {
    if (n < 0) return -1
    if (n == 0) return 1
    return n * factorial(n - 1)
}