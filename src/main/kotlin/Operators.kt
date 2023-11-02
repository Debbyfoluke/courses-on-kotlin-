


fun main(args: Array<String>) {
    var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    val myNumber = 100
    if (myNumber > 150) {
        println("Greater than 150")
    } else if (myNumber > 90) {
        println("Greater than 90")
    }
    else {
        println("All conditions failed.")
    }

//    val isPlaying = true
//    val score = 100
//    if (isPlaying && score == 100) {
//        println("Next level opened")
//    } else {
//        println("Still at the same level")
//    }

    val num1 = 5
    val num2 = 4
    if (num1 > 0 || num2 > 0) println("This condition is true") else println("This condition is true")
}