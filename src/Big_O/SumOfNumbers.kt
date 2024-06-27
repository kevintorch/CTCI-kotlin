package Big_O

fun main() {

}

//  n + (n - 1) + (n - 2) ... 0  O(n) S(n)  ==>  1 + 2 + 3 +... n
private fun sum(n: Int): Int {
    if (n <= 0) return 0
    return n + sum(n - 1)
}

// (0 + 1) + (1 + 2) + (2 + 3) + (3 + 4) + ... ((n - 1) + n)
private fun pairSumSequence(n: Int): Int {
    var sum = 0

    // iterate one less than n
    // because in last iteration we need next number ( i + 1 == n).
    for (i in 0..<n) {
        sum += i + (i + 1)
    }

    return sum
}

/**
 * O(2^N) ,  Space O(N)
 *
 */
private fun fac(n: Int): Int {
    if (n <= 1) return 1
    return fac(n - 1) + fac(n - 1)
}