package Big_O.Examples_And_Excercises

/**
 * The inner for loop has O(N) iterations, and it is called N times. Therefore, the runtime is O(N²).
 */
private fun printUnorderedPairs(array: Array<Int>) {
    for (i in array.indices) {
        for (j in i+1..<array.size) {
            println("${array[i]}, ${array[j]}")
        }
    }
}

fun main() {
    printUnorderedPairs(arrayOf(1, 2, 3, 4, 5))
}