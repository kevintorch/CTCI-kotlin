package Big_O.Examples_And_Excercises

/**
 * This algorithm runs in O(N) time. The fact that it only goes through half of the array (in terms of iterations) does not impact the big O time.
 */
private fun reverse(array: Array<Int>) {
    for (i in 0..<array.size / 2) {
        val other = array.size - i - 1

        // Swap
        val temp = array[i]
        array[i] = array[other]
        array[other] = temp
    }
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    reverse(array)
    println(array.contentToString())
}