package Big_O.Examples_And_Excercises

/**
 * The following code prints all Fibonacci numbers from O to n.
 *
 * Many people will rush to concluding that since fib(n) takes O(2ᴺ) time, and it's called n times, then it's O(n * 2ᴺ).
 *
 * The error is that the n is changing. Yes, fib(n) takes O(2ᴺ) time, but it matters what that value of n is.
 *
 * Instead, let's walk through each call.
 * fib(!) -> 2¹ steps
 * fib(2) -> 2² steps
 * fib(3) -> 2³ steps
 * fib(4) -> 2⁴ steps
 * ...
 * fib(n) -> 2ᴺ steps
 * Therefore, the total amount of work is:  2¹ + 2² + 2³ + 2⁴ + . . . + 2ᴺ. And this is 2ᴺ⁺¹
 *
 * Therefore, the runtime to compute the first n Fibonacci numbers (using this terrible algorithm) is still O(2ᴺ).
 *
 */
private fun allFib(n: Int) {
    for (i in 0..<n) {
        println("$i: ${fib(i)}")
    }
}

private fun fib(n: Int) : Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fib(n - 1) + fib(n - 2)
}