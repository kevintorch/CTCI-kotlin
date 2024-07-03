package Helper_Extensions

import java.util.Arrays

fun runtimeOf(description: String = "Operation", op: () -> Unit) {
    val start = System.nanoTime()
    op()
    val ns = System.nanoTime() - start
    println("Running Time: $description: Elapsed Time = ${ns} ns (${ns / 1000_000} ms)")

}

fun IntRange.offsetBy(i: Int): IntRange = if ((start + i) in this) IntRange(start + i, last) else this

fun String.sorted(): String = String(toCharArray().sortedArray())