package Big_O.Examples_And_Excercises

/**
 * This code counts all permutations of a string.
 *
 * We can think about this by looking at how many times permutation gets called and how long each call takes.
 *
 * How many times does permutation get called in its base case?
 * - Suppose we had 7 characters in the string. In the first slot, we have 7 choices.
 *   Once we pick the letter there, we have 6 choices for the next slot.
 *   (Note that this is 6 choices for each of the 7 choices earlier.) Then 5 choices for the next slot,and so on.
 *
 *   Therefore,the total number of options is 7 * 6 * 5 * 4 * 3 * 2 * 1, which is also expressed as 7! (7 factorial).
 *   This tells us that there are n! permutations. Therefore, permutation is called n ! times in its base case (when prefix is the full permutation).
 *
 * How many times does permutation get called before its base case?
 * -  Picture a large call tree representing all the calls.
 *    There are n! leaves, as shown above. Each leaf is attached to a path of length n.
 *    Therefore, we know there will be no more than n * n ! nodes (function calls) in this tree.
 *
 * How long does each function call take?
 * - Executing ``` println(prefix)``` takes O(n) time since each character needs to be printed.
 *   Line
 *   ```val rem = str.substring(0, i) + str.substring(i + 1)```
 *   and Line
 *   ```permutation(rem, prefix + str[i])```
 *   will also take O(n) time combined, due to the string concatenation.
 *   Observe that the sum of the lengths of rem, prefix, and str[i] will always be n.
 *   Each node in our call tree therefore corresponds to O(n) work.
 *
 * What is the total runtime?
 * - Since we are calling permutation O(n * n!) times (as an upper bound), and each one takes O(n) time,
 *   the total runtime will not exceed O(n² * n!).
 *
 */
private fun permutation(str: String) {
    permutation(str, "")
}

private fun permutation(str: String, prefix: String) {
    if (str.length == 0) {
        println(prefix)
    } else {
        for (i in str.indices) {
            val rem = str.substring(0, i) + str.substring(i + 1)
            permutation(rem, prefix + str[i])
        }
    }
}