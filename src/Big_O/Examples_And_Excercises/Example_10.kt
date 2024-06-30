package Big_O.Examples_And_Excercises

/**
 * The following method checks if a number is prime by checking for divisibility on numbers less than it.
 * It only needs to go up to the square root of n because if n is divisible by a number greater than its square root
 * then it's divisible by something smaller than it.
 *
 * For example, while 33 is divisible by 11 (which is greater than the square root of 33),
 * the "counterpart" to 11 is 3 (3 * 11 = 33). 33 will have already been eliminated as a prime number by 3.
 *
 * The for loop will start when x = 2 and end when x*x = n.
 * Or, in other words,it stops when x = √n (when x equals the square root of n).
 *
 * This runs in O(√n) time.
 *
 */
private fun isPrime(n: Int): Boolean {
    var x = 2
    while (x * x <= n) {
        if (n % x == 0) {
            return false
        }
        x++
    }
    return true
}