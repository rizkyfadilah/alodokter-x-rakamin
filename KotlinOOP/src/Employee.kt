open class Employee(val name: String) {
    open fun hello(name: String) {
        println("hello $name, this is my name ${this.name}")
    }
}

class Manager(name: String): Employee(name) {
    override fun hello(name: String) {
        println("hello $name, this is my manager name ${this.name}")
    }
}
class VicePresident(name: String): Employee(name)
class Boss(name: String): Employee(name) {
    override fun hello(name: String) {
        println("hello $name, this is my boss name ${this.name}")
    }
}

fun main(){
    val manager = Manager("Rizqan")
    manager.hello("Budi")

    val vicePresident = VicePresident("Mamat")
    vicePresident.hello("Ahmad")

    val boss = Boss("Nisa")
    boss.hello("Aziz")
}