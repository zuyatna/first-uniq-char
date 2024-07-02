//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    firstUniqChar("leetcode")
}

fun firstUniqChar(s: String): Int {
    val breakChar = s.map { it.toString() }.toTypedArray().toMutableList()
    println(breakChar.toList())

    return 0
}