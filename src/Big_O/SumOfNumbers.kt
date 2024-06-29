package Big_O

fun main() {

}

//  n + (n - 1) + (n - 2) ... 0  O(n) S(n)  ==>  1 + 2 + 3 +... n
private fun sum(n: Int): Int {
    if (n <= 0) return 0
    return n + sum(n - 1)
}

// (0 + 1) + (1 + 2) + (2 + 3) + (3 + 4) + ... ((n - 1) + n)


/**
 * O(2^N) ,  Space O(N)
 *
 */
private fun fac(n: Int): Int {
    if (n <= 1) return 1
    return fac(n - 1) + fac(n - 1)
}