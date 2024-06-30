package Big_O.Examples_And_Excercises

/**
 * Which of the following are equivalent to O(N)? Why?
 * O(N + P), where P < N / 2
 * O(2N)
 * O(N + log N)
 * O(N + M)
 *
 * Let's go through these.
 *
 * If P < N / 2, then we know that N is the dominant terms o we can drop the O(P).
 * O(2N) is O(N) since we drop constants.
 * O(N) dominates O(log N), so we can drop the O(log N).
 * There is no established relationship between N and M, so we have to keep both variables in there.
 *
 * Therefore, all but the last one are equivalent to O(N).
 */
fun problem7() {}