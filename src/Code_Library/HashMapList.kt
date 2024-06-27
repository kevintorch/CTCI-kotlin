package Code_Library

import java.util.HashMap


/**
 * The HashMapList class is essentially shorthand for HashMap<T, Arraylist<E>>&gt;.
 * It allows us to map from an item of type ofT to an ArrayList of type E.
 *
 * For example, we might want a data structure that maps from an integer to a list of strings.
 *
 * Ordinarily, we'd have to write something like this:
 *
 *```
 *     val mapList = HashMap<Int, ArrayList<String>>()
 *     for (s in strings) {
 *         val key = computeValue(s);
 *         if (!mapList.containsKey(key)) {
 *             mapList.put(key, ArrayList())
 *         }
 *         mapList.get(key).add(s)
 *     }
 * ```
 * Now you can just write this:
 * ```
 *     val mapList = HashMapList<Int, String>()
 *     for (s in strings) {
 *         val key = computeValue(s)
 *         mapList.put(key, s)
 *     }
 * ```
 */
class HashMapList<T, E>  {

    private val map = HashMap<T, ArrayList<E>?>()

    fun put(key: T, item: E) {
        if (!map.containsKey(key)) {
            map[key] = ArrayList()
        }
        map[key]!!.add(item)
    }

    fun put(key: T, items: ArrayList<E>?) {
        map[key] = items
    }

    fun get(key: T): ArrayList<E>? {
        return map[key]
    }

    fun containsKey(key: T): Boolean {
        return map.containsKey(key)
    }

    fun containsKeyValue(key: T, value: E): Boolean {
        val list = get(key) ?: return false
        return list.contains(value)
    }

    fun keySet(): Set<T> {
        return map.keys
    }

    override fun toString(): String {
        return map.toString()
    }
}