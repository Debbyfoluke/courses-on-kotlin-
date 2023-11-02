fun main() {

}

class App : A by FirstDelegate(), B by SecondDelegate() {
    override fun print() {
        
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate : A {
    override fun print() {

    }
}

open class SecondDelegate : B {
    override fun print2() {

    }
}