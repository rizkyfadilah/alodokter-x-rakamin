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
class Boss(name: String): Employee(name)

fun main(){
    val manager = Manager("Rani")
    manager.hello("Anna")

    val vicePresident = VicePresident("Dino")
    vicePresident.hello("Alvin")

    val boss = Boss("Tiara")
    boss.hello("Viki")
}