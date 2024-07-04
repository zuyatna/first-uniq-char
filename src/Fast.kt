fun fastFirstUniqChar(s: String): Int {
    val charCount = mutableMapOf<Char, Int>()

    // Count the occurrences of each character
    for (char in s) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
        print("$char, ${charCount[char]}; ")
    }
    println()

    // Find the first unique character
    for (i in s.indices) {
        print("${charCount[s[i]]}; ")
        if (charCount[s[i]] == 1) {
            return i
        }
    }

    return -1
}