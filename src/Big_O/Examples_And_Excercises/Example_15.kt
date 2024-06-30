package Big_O.Examples_And_Excercises

/**
 * The following code prints all Fibonacci numbers from O to n. However, this time,
 * it stores (i.e., caches) previously computed values in an integer array.
 * If it has already been computed, it just returns the cache.
 *
 * Let's walk through what this algorithm does.
 *
 * ```
 * fib(1) -> return 1
 * fib(2)
 *     fib(1) -> return 1
 *     fib(0) -> return 0
 *     store 1 at memo[2]
 * fib(3)
 *     fib(2) -> lookup memo[2] -> return 1
 *     fib(1) -> return 1
 *     store 2 at memo[3]
 * fib(4)
 *     fib(3) -> lookup memo[3] -> return 2
 *     fib(2) -> lookup memo[2] -> return 1
 *     store 3 at memo[4]
 * fib(S)
 *     fib(4) -> lookup memo[4] -> return 3
 *     fib(3) -> lookup memo[3] -> return 2
 *     store 5 at memo[S]
 * ...
 *
 * ```
 * At each call to fib(i), we have already computed and stored the values for fib(i-1) and fib(i-2).
 * We just look up those values, sum them, store the new result, and return. This takes a constant amount of time.
 *
 * We're doing a constant amount of work N times, so this is O ( n) time.
 *
 * This technique, called memoization, is a very common one to optimize exponential time recursive algorithms.
 */
private fun allFib(n: Int) {
    var memo = IntArray(n + 1)
    for (i in 0..<n) {
        println("$i: ${fib(i, memo)}")
    }
}

private fun fib(n: Int, memo: IntArray) : Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    if (memo[n] > 0) return memo[n]

    memo[n] = fib(n - 1, memo) + fib(n - 2,  memo)
    return memo[n]
}