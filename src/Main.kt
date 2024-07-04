//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    firstUniqChar("loveleetcode")
}

fun firstUniqChar(s: String): Int {
    val breakChar = s.map { it.toString() }.toTypedArray()

    for (i in breakChar.indices) {
        val copyBreakChar = breakChar.toMutableList()
        copyBreakChar.removeAt(i)
        println("index: $i, value: ${breakChar[i]}")
        println(copyBreakChar.toList())

        if (copyBreakChar.contains(breakChar[i])) {
            println("contain")
            println()
        } else {
            println("not contain")
            return i
        }
    }

    return -1
}