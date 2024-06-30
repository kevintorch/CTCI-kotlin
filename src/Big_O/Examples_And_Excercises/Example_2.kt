package Big_O.Examples_And_Excercises

/**
 * The inner for loop has O(N) iterations, and it is called N times. Therefore, the runtime is O(N²).
 */
private fun printPairs(array: Array<Int>) {
    for (x in array) {
        for (y in array) {
            println("$x, $y")
        }
    }
}

fun main() {
    printPairs(arrayOf(1, 2, 3, 4, 5))
}