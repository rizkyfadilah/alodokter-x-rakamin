open class Employee(val name: String) {
    open fun hello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

class Manager(name: String) : Employee(name) {
    fun parking() {

    }

    override fun hello(name: String) {
        println("Hello $name, this is my manager name ${this.name}")
    }
}

class VicePresident(name: String): Employee(name)
class Boss(name: String): Employee(name)

fun main() {
    val alvin = Manager("Alvin")
    alvin.hello("Budi")

    val budi = VicePresident("Budi")
    budi.hello("Alvin")
}