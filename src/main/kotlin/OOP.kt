fun main(args: Array<String>) {

    val LoginButton = Button("Login", 12332, object : OnClickListener {
        override fun onClick() {

        }
    })
    val signButton = Button("Sign up", 23423, object : OnClickListener {
        override fun onClick() {

        }
    })
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)
class ClickListener() : OnClickListener{
    override fun onClick() {

    }
}

interface OnClickListener {
    fun onClick()
}
























//interface Engine {
//    fun  StartEngine()
//}
//
//class Car(val name: String, val color: String,): Engine {
//    override fun StartEngine() {
//        println("The car is starting the engine.")
//    }
//}
//
//class Truck(val name: String, val color: String,): Engine {
//    override fun StartEngine() {
//        println("The truck is starting the engine.")
//    }
//}
//
//class Plane(val name: String, val color: String,): Engine {
//    override fun StartEngine() {
//        println("The plane is starting the engine.")
//    }
//}
//
//class Tesla(val name: String, val color: String,): Engine {
//    override fun StartEngine() {
//        println("The tesla is starting the engine.")
//    }
//}

//val user1 = User("Alex", "Dobbin", 23)
//    val user2 = User("Alex", "Dobbin", 23)
//println(user1.equals(user2))
//    println(user1)
//    println(user2)
//class User(var firstName: String, var lastName: String, var age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//        if (other is User) {
//            return this.firstName == other
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User(firstName '$firstName', lastName'$lastName', age '$age'"
//    }
//}

// abstract class Vehicle {
//   abstract fun move()
//
//    abstract fun stop()
//}
//
//class Car(var name: String,var color: String, val engine: Int, val doors: Int): Vehicle() {
//    override fun move() {
//
//    }
//
//    override fun stop() {
//
//    }
//}
//

//val success = Result.Success("SUCCESS")
//    val progress = Result.Progress("PROGRESS")
//
//    getData(success)

//fun getData(result: Result) {
//    when(result) {
//        is Result.Error.NonRecoverableError -> result.showMessage()
//        is Result.Error.RecoverableError -> result.showMessage()
//        is Result.Progress -> result.showMessage()
//        is Result.Success -> result.showMessage()
//    }
//}
//
//sealed class Result(val message: String) {
//    fun showMessage() {
//        println("Result: $message")
//    }
//    class Success(message: String): Result(message)
//    sealed class Error(message: String): Result(message) {
//        class RecoverableError(exception: Exception, message: String): Error(message)
//        class NonRecoverableError(exception: Exception, message: String): Error(message)
//    }
//    class Progress(message: String) : Result(message)
//
//}


//val view = View()
//    val button = Button("Login", "Center")
//    val roundButton = RoundButton("Sign up", "Center", 30)
//
//    view.draw()
//    button.draw()
//    roundButton.draw()

//open class View() {
//    open fun draw() {
//        println("Drawing the view")
//    }
//}
//open class Button(val text: String, val orientation: String): View() {
//
//    override fun draw() {
//        println("Drawing the button")
//        super.draw()
//    }
//}
//
//class RoundButton(text: String,orientation: String, val corners: Int): Button(text, orientation) {
//    override fun draw() {
//        println("Drawing the round button")
//        super.draw()
//    }


//val alexAccount = Account("Alex")
//    alexAccount.deposit(1000)
//    alexAccount.withdraw(500)
//    alexAccount.deposit(-20)
//    alexAccount.withdraw(-100)
//
//     val balance = alexAccount.calculateBalance()
//    println("Balance is $balance")


//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north", 10),
//    SOUTH("south", 20),
//    EAST("east", 15),
//    WEST("west", 40)
//}


//println(Database)
//    println(Database)

//val instance = Database.getInstance()
//    val instance2 = Database.getInstance()
//    println(instance)
//    println(instance2)
//
//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance
//        }
//
//}
//    val result = Calculator.sum(5, 10)
//    println(result)
//    val calculator = Calculator()
//    val result = calculator.sum(5, 10)
//    println(result)


//val user = User("Alex","Dobbbi", 23)
////
//user.favouriteMovie = "Intersteller"
//println("My favourite movie is ${user.favouriteMovie}")
//val friend = User(firstName = "john", lastName = "Smith")
//    val user2 = User(age = 19, firstName = "Ioana", lastName = "Dobbbi")
//
//    user.firstName = "Vlad"
//
//    println(user.firstName)
//    println(user.lastName)
//    println(user.age)
//
//    println("\n")
//
//    println(friend.firstName)
//    println(friend.lastName)
//    println(friend.age)


//var firstName = firstName
//        get() {
//            return "FirstName: $field"
//        }
//        set(value) {
//            println("$value was assigned to firstName property")
//            field = value
//        }

//    fun getFirstName(newValue: String) {
//        this.firstName = newValue
//    }
//    fun getFirstName(): String {
//        return this.firstName
//    }


//constructor(name: String): this(name, "LastName", 0) {
//        println("2nd")
//    }
//    constructor(name: String, lastName: String): this(name, lastName, 0) {
//        println("3rd")
//    }

//init {
//        if (name.lowercase().startsWith("a")){
//            this.name = name
//        } else {
//            this.name = "User"
//            println("The name doesn't start with letter 'a' or 'A'")
//        }
//    }

//
//val car1 = car("Tesla","S Plaid", "Red", 4)
//
//
//println("Name = ${car1.name}")
//println("Model = ${car1.model}")
//println("Color = ${car1.color}")
//println("Doors = ${car1.doors}")
//
//car1.move()
//car1.stop()
//
//val car2 = car("Ford","Mustang", "Blue", 2)
//
//println("\n")
//println("Name = ${car2.name}")
//println("Model = ${car2.model}")
//println("Color = ${car2.color}")
//println("Doors = ${car2.doors}")
//
//car2.move()
//car2.stop()

//