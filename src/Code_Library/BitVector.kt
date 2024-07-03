package Code_Library

class BitVector(private val length: Int) {
    private val vector: IntArray = if (length % DATA_SIZE == 0) {
        IntArray(length / DATA_SIZE)
    } else {
        IntArray(length / DATA_SIZE + 1)
    }

    fun length(): Int {
        return length
    }

    fun get(i: Int): Boolean {
        val b = vector[i / DATA_SIZE]
        val bitIndex = i % DATA_SIZE

        return if (((b shr bitIndex) and 1) == 1) {
            true
        } else {
            false
        }
    }

    fun print() {
        for (k in vector) {
            for (i in 0..<DATA_SIZE) {
                if ((k shr i and 1) == 1) {
                    print(1)
                } else {
                    print(0)
                }
            }
            println()
        }
    }

    fun set(i: Int, flag: Boolean) {
        if (i in 0..<length) {
            val mask = (1 shl i).inv()
            val b = vector[i / DATA_SIZE] and mask
            if (flag) {
                vector[i / DATA_SIZE] = b or (1 shl i)
            } else {
                vector[i / DATA_SIZE] = b
            }
        }
    }

    companion object {
        private const val DATA_SIZE = 32
    }
}