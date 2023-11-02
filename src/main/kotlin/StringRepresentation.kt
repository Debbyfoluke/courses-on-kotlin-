fun main() {
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listsString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listsString))

    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": and" ))

    val numbers =  (1 .. 100).toList()
    println(numbers)
}