package Big_O.Examples_And_Excercises

/**
 * The following function prints the powers of 2 from 1 through n (inclusive).
 * For example, if n is 4, it would print 1, 2, and 4.
 *
 * There are several ways we could compute this runtime.
 *
 * ***What It Does***
 *
 * Let's walk through a call like powers0f2(50).
 *
 * ```
 * powersOf2(50)
 *     -> powersOf2(25)
 *         -> powersOf2(12)
 *             -> powersOf2(6)
 *                 -> powersOf2(3)
 *                     -> powersOf2(1)
 *                         -> print & return 1
 *                         print & return 2
 *                    print & return 4
 *               print & return 8
 *          print & return 16
 *      print & return 32
 * ```
 * The runtime, then, is the number of times we can divide 50 (or n) by 2 until we get down to the base case (1).
 * the number of times we can halve n until we get 1 is O(log n).
 *
 *
 * ***What It Means***
 *
 * We can also approach the runtime by thinking about what the code is supposed to be doing.
 * It's supposed to be computing the powers of 2 from 1 through n.
 * Each call to powersOf2 results in exactly one number being printed and returned (excluding what happens in the recursive calls).
 * So if the algorithm prints 13 values at the end, then powersOf2 was called 13 times.
 * In this case, we are told that it prints all the powers of 2 between 1 and n.
 * Therefore, the number of times the function is called (which will be its runtime) must equal the number of powers of 2 between 1 and n.
 * There are log N powersOf2 between 1 and n.Therefore, the runtime is O(log n).
 *
 * ***Rate of Increase***
 *
 * A final way to approach the runtime is to think about how the runtime changes as n gets bigger.
 * After all, this is exactly what big O time means.
 *
 * If N goes from P to P+1, the number of calls to powersOfTwo might not change at all.
 * When will the number of calls to powersOfTwo increase? It will increase by 1 each time n doubles in size.
 *
 * So, each time n doubles, the number of calls to powersOfTwo increases by 1.
 * Therefore, the number of calls to powersOfTwo is the number of times you can double 1 until you get n.
 * It is x in the equation 2ˣ = n.
 *
 * What is x? The value of x is log n. This is exactly what meant by x = log n. Therefore, the runtime is O(log n).
 */
private fun powersOf2(n: Int) : Int {
    if (n < 1) return 0
    if (n == 1) {
        println(1)
        return 1
    }
    val prev = powersOf2(n / 2)
    val curr = prev * 2
    println(curr)
    return curr
}