open class Employee(val name: String){
    open fun hello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

class Manager(name: String): Employee(name){
    fun parking(){

    }

    override fun hello(name: String) {
        println("Hello $name, I'm your manager ${this.name}")
    }
}
class VicePresident(name: String): Employee(name)
class Boss(name: String): Employee(name)

fun main() {
    val evandio = Manager("Evandio")
    evandio.hello("Bob")

    val udin = VicePresident("Udin")
    udin.hello("Martin")
}
