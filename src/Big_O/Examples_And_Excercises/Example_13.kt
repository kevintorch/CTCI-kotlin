package Big_O.Examples_And_Excercises

/**
 * The following code computes the Nth Fibonacci number.
 *
 * There are 2 branches per call, and we go as deep as N,therefore the runtime is O(2ᴺ).
 *
 * > **Note:**
 *       Through some very complicated math,we can actually get a tighter runtime. The time is indeed exponential,
 *       but it's actually closer to O(1. 6ᴺ). The reason that it's not exactly O(2ᴺ) is that,
 *       at the bottom of the call stack,there is sometimes only one call.
 *       It turns out that a lot of the nodes are at the bottom (as is true in most trees),
 *       so this single versus double call actually makes a big difference.
 *       Saying O(2N) would suffice for the scope of an interview,
 *       You might get "bonus points" if you can recognize that it'll actually be less than that.
 */
private fun fib(n: Int) : Int {
    if (n <= 0) return 0
    if (n == 1) return 1
    return fib(n - 1) + fib(n - 2)
}