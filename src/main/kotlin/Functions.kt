fun main(args: Array<String>) {
    sum(1, 4, 6, 7, 8, 5,9)
}

fun sum(vararg numbers: Int) {
    numbers.forEach{ println(it) }
}






















//println(sum(5, 6, 7,10, 5, 4, 7, 6, 7, 8, 9, 3))
//fun sum(vararg numbers: Int): Int {
//    var result = 0
//    for (number in numbers) {
//        result += number
//    }
//    return result
//}






































//sendMessage("Alexa", "Hello!")
//fun sendMessage(name: String = "User", message:String = "") {
//    println("Name = $name and message = $message")
//}

//val max = getMax(3,100, 10)
//    println(max)
//fun getMax(a: Int, b: Int): Int = if (a > b) a else b
//fun getMax(a: Double, b: Double): Double = if (a > b) a else b
//fun getMax(a: Int, b: Int, c: Int): Int {
//    return if (a >= b && a >= c){
//        a
//    }else if (b >= a && b >= c){
//        b
//    }else{
//        c
//    }
//}

//    sayHello("Alex", 22)
//
//    val hasInternetConnection = false
//    if (hasInternetConnection) {
//        getData("Some data")
//    }else {
//        showMessage()
//    }
//fun sayHello(name: String, age: Int) {
//    var number = age
//    println("Hello, $name! Your age is $age")
//}
//
//fun getData(data: String) {
//    println("Your data is:$data")
//}
//
//fun showMessage() {
//    println("There's no internet connection")
//}