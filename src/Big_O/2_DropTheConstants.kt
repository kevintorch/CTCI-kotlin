package Big_O

/*
    It is very possible for O(N) code to run faster than 0(1) code for specific inputs. Big O just describes the rate of increase.
    For this reason, we drop the constants in runtime. An algorithm that one might have described as 0(2N) is actually O(N).
 */

/**
 *  O(n)
 */
private fun `Min and Max 1`(array: Array<Int>) {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    for (x in array) {
        if (x < min) min = x
        if (x > max) max = x
    }
}

/**
 *  O(2N) == O(N)
 */
private fun `Min and Max 2`(array: Array<Int>) {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    for (x in array) {
        if (x < min) min = x
    }
    for (x in array) {
        if (x > max) max = x
    }
}

fun main() {
    `Min and Max 1`(arrayOf(24, 4, 3, 23, 21, 1, -1, 0, 0, 2))
    `Min and Max 2`(arrayOf(24, 4, 3, 23, 21, 1, -1, 0, 0, 2))
}