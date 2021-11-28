open class Employee(val name: String) {
    open fun hello(name: String) {
        println("Hello $name, this is ${this.name}")
    }
}

class Manager(name: String) : Employee(name) {
    fun parking() {
        println("${this.name} is free parking")
    }

    final override fun hello(name: String){
        println("Hello $name, this is manager ${this.name}")
    }
}

class VicePresident(name: String) : Employee(name)

fun main() {
    val febian = Manager("Febian")
    febian.hello("Anna")

    val andi = VicePresident("Andi")
    andi.hello("Anna")
}