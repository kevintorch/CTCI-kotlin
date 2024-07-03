package Helper_Extensions

fun <T> Array<T>.reverse(a: Array<T>, start: Int = 0, end: Int = a.size - 1) {
    if (start >= end) return
    swap(start, end)
    return reverse(a, start + 1, end - 1)
}

fun IntArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun <T> Array<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}