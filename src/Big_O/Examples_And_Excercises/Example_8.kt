package Big_O.Examples_And_Excercises

/**
 * Suppose we had an algorithm that took in an array of strings, sorted each string, and then sorted the full array.
 * What would the runtime be?
 * Many candidates will reason the following: sorting each string is O(N log N) and we have to do this for each string,
 * so that's O(N*N log N).We also have to sort this array, so that's an additional O(N log N) work.
 * Therefore, the total runtime is O(N² log N + N log N), which is just O(N² log N).
 *
 * This is completely incorrect. Did you catch the error?
 *
 * The problem is that we used N in two different ways. In one case, it's the length of the string (which string?).
 * And in another case, it's the length of the array.
 *
 * In your interviews, you can prevent this error by either not using the variable "N" at all,
 * or by only using it when there is no ambiguity as to what N could represent.
 *
 * In fact, I wouldn't even use a and b here, or m and n. It's too easy to forget which is which and mix them up.
 * An O(a²) runtime is completely different from an O(a*b) runtime.
 *
 * Let's define new terms and use names that are logical.
 * - Let s be the length of the longest string.
 * - Let a be the length of the array.
 *
 * Now we can work through this in parts:
 *
 * - Sorting each string is0(s log s).
 * - We have to do this for every string (and there are a strings), so that's O(a*s log s).
 * - Now we have to sort all the strings. There are a strings, so you will maybe incline to say that this takes O(a log a) time.
 *   This is what most candidates would say. You should also take into account that you need to compare the strings.
 *   Each string comparison takes O(s) time. There are O(a log a) comparisons, therefore this will take 0(a*s log a) time.
 *
 *   If you add up these two parts, you get O(a*s(log a + log s)). This is it. There is no way to reduce it further.
 *
 */
fun problem8() {}