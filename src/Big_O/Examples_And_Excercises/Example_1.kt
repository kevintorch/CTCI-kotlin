package Big_O.Examples_And_Excercises

/**
 * This will take O(N) time. The fact that we iterate through the array twice doesn't matter.
 */
private fun foo(array: Array<Int>) {
    var sum = 0
    var product = 1
    for (element in array) {
        sum += element
    }
    for (element in array) {
        product *= element
    }
    println("$sum, $product")
}