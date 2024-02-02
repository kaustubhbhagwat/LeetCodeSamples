class MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        val sb = StringBuilder()
        var i = 0
        var j = 0
        while (i < word1.length && j < word2.length) {
            sb.append(word1[i++]).append(word2[j++])
        }

        if (i < word1.length) {
            sb.append(word1.substring(i))
        }
        if (j < word2.length) {
            sb.append(word2.substring(j))
        }
        return sb.toString()
    }
}

fun main() {
    val mergeStringsAlternately = MergeStringsAlternately()
    println(mergeStringsAlternately.mergeAlternately("ABC","PQR"))
}