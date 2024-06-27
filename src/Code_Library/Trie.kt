package Code_Library

/**
 * The trie data structure is used in a few problems to make it easier to look up
 * if a word is a prefix of any other words in a dictionary (or list of valid words).
 * This is often used when we're recursively building words so that we can short circuit when the word is not valid.
 */

class Trie {
    private val root: TrieNode

    /* Takes a list of strings as an argument, and constructs a trie that stores these strings. */
    constructor(list: ArrayList<String?>) {
        root = TrieNode()
        for (word in list) {
            root.addWord(word)
        }
    }

    /* Takes a list of strings as an argument, and constructs a trie that stores these strings. */
    constructor(list: Array<String?>) {
        root = TrieNode()
        for (word in list) {
            root.addWord(word)
        }
    }

    /* Checks whether this trie contains a string with the prefix passed in as argument. */
    @JvmOverloads
    fun contains(prefix: String, exact: Boolean = false): Boolean {
        var lastNode: TrieNode? = root
        for (ch in prefix.toCharArray()) {
            lastNode = lastNode!!.getChild(ch)
            if (lastNode == null) return false
        }
        return !exact || lastNode!!.isTerminates
    }

    fun getRoot(): TrieNode {
        return root
    }
}

class TrieNode(private var char: Char = 0.toChar()) {
    private val children = HashMap<Char, TrieNode>()
    var isTerminates: Boolean = false

    fun getChar() = char

    fun addWord(word: String?) {
        if (word == null || word.isEmpty()) return

        val firstChar = word[0]
        var child = getChild(firstChar)
        if (child == null) {
            child = TrieNode(firstChar)
            children[firstChar] = child
        }

        if (word.length > 1) {
            child.addWord(word.substring(1))
        } else {
            child.isTerminates = true
        }
    }

    fun getChild(c: Char): TrieNode? {
        return children[c]
    }
}