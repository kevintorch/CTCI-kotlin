package Big_O

/*
    Space complexity is a parallel concept to time complexity. If we need to create an array of size n,
    this will require 0(n) space. If we need a two-dimensional array of size nxn, this will require O(n²) space.
 */

/**
 *  Stack space in recursive calls counts, too
 *
 *  O(n) time and O(n) space.
 *
 *  Each of these calls is added to the call stack and takes up actual memory.
 *
 *  sum(4)
 *    -> sum(3)
 *         -> sum(2)
 *              -> sum(l)
 *                   -> sum(0)
 *
 */
private fun sum(n: Int): Int {
    if (n <= 0) return 0
    return n +  sum(n -1)
}

/**
 *  However, just because you have n calls total doesn't mean it takesO(n) space.
 *  Consider the below function, which adds adjacent elements between 0 and n.
 *
 *  There will be roughly O(n) calls to pairSum.
 *  However, those calls do not exist simultaneously on the call stack, so you only need O(1) space.
 */
private fun pairSumSequence(n: Int): Int {
    var sum = 0

    // iterate one less than n
    // because in last iteration we need next number ( i + 1 == n).
    for (i in 0..<n) {
        sum += pairSum(i, i + 1)
    }
    return sum
}

private fun pairSum(a: Int, b: Int) = a + b


