package Big_O.Examples_And_Excercises

/**
 * For each element of arrayA, the inner for loop goes through b iterations, where b = arrayB.size.
 * if a = arrayA.size, then the runtime is O(ab).
 *
 * If you said O(N²), then remember your mistake for the future. It's not O(N²) because there are two different inputs.
 * Both matter. This is an extremely common mistake.
 */
private fun printUnorderedPairs(arrayA: Array<Int>, arrayB: Array<Int>) {
    for (a in arrayA) {
        for (b in arrayB) {
            if (a < b) {
                println("$a, $b")
            }
        }
    }
}

fun main() {
    printUnorderedPairs(arrayOf(1, 2, 3, 4, 5), arrayOf(1, 2, 3, 4, 5))
}