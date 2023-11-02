

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }


}


object Database {
    init {
        println("Database created")
    }
}

//class User(firstName: String, var lastName: String, var age: Int) {
//    init {
//        println("User: $firstName was created")
//    }
//}

class Account(val accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()
    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited.Balance is now ${this.balance}")
        } else {
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal deposited.Balance is now ${this.balance}")
        } else {
            println("Cannot withdraw negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }

}














//class car(var name: String, var model: String, var color: String, var doors: Int) {
//
//    fun move() {
//        println("The car $name is moving")
//    }
//
//    fun stop() {
//        println("The car $name has stopped")
//    }
//}