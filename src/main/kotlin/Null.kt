

fun main(args: Array<String>) {
    var text: String? = null

    text = "The varible is null"
    var text2 = ""

    if (text != null) {
        text2 = text
    } else {
        text2 = "This variable is null"
    }
    println(text2)
}
