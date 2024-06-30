package Big_O.Examples_And_Excercises

/**
 * Nothing has really changed here. 100,000 units of work is still constant, so the runtime is 0(ab).
 */
private fun printUnorderedPairs(arrayA: Array<Int>, arrayB: Array<Int>) {
    for (a in arrayA) {
        for (b in arrayB) {
            for (k in 0..<100_000) {
                println("$a, $b")
            }
        }
    }
}

fun main() {
    printUnorderedPairs(arrayOf(1, 2, 3, 4, 5), arrayOf(1, 2, 3, 4, 5))
}