package Big_O.Additional_Problems

/**
 *  The appendToNew method appends a value to an array by creating a new, longer array and returning this longer array.
 *  You've used the appendToNew method to create a copyArray function that repeatedly calls appendToNew.
 *  How long does copying an array take?
 *
 *  O(N²)
 *
 *  where n is the number of elements in the array. The first call to appendToNew takes 1 copy.
 *  The second call takes 2 copies.
 *  The third call takes 3 copies. And so on.
 *  The total time will be the sum of 1 through n, which is O(n²).
 *
 */
private fun copArray(array: IntArray) : IntArray {
    var copy = IntArray(0)
    for (value in array) {
        copy = appendToNew(copy, value)
    }
    return copy
}

private fun appendToNew(array: IntArray, value: Int): IntArray {
    val bigger = IntArray(array.size + 1)
    for (i in array.indices) {
        bigger[i] = array[i]
    }
    bigger[bigger.size - 1] = value
    return bigger
}