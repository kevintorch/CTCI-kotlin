package Big_O.Additional_Problems

import java.util.*
import java.util.Arrays.binarySearch

/**
 * The following code computes the intersection (the number of elements in common) of two arrays.
 * It assumes that neither array has duplicates.
 * It computes the intersection by sorting one array (array b)
 * and then iterating through array a checking (via binary search) if each value is in b. What is its runtime?
 *
 * O(b log b) + O(a log b) ==> O(b log b + a log b)
 *
 * First,we have to sort array b, which takes O(b log b) time.
 * Then, for each element in a, we do binary search in O(log b) time.
 * The second part takes O(a log b) time.
 *
 */
private fun intersection(a: IntArray, b: IntArray) : Int {
    Arrays.sort(b)
    var intersect = 0

    for (x in a) {
        if (binarySearch(b, x) >= 0) {
            intersect++
        }
    }
    return intersect
}