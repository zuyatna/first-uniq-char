//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    firstUniqChar("loveleetcode")
    fastFirstUniqChar("leetcode")
}

fun firstUniqChar(s: String): Int {
    val breakChar = s.map { it.toString() }.toTypedArray()

    for (i in breakChar.indices) {
        val copyBreakChar = breakChar.toMutableList()
        copyBreakChar.removeAt(i)

        if (!copyBreakChar.contains(breakChar[i])) {
            return i
        }
    }

    return -1
}