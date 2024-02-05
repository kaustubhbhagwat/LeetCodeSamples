class ReverseVowelsInAString {
    fun reverseVowels(s: String): String {
        val arrVowels = arrayOf("A", "E", "I", "O", "U", "a", "e", "i", "o", "u")
        val result = s.toCharArray()
        var l = 0
        var r = s.lastIndex
        while (l < r) {
            if (!arrVowels.contains(s[l].toString())) {
                l++
                continue
            }
            if (!arrVowels.contains(s[r].toString())) {
                r--
                continue
            }
            result[l] = s[r]
            result[r] = s[l]
            l++
            r--
        }
        return result.joinToString("")
    }
}

fun main() {
    val reverseVowelsInAString = ReverseVowelsInAString()
    println(reverseVowelsInAString.reverseVowels("Hello"))
}