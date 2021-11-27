open class Employee (val name: String) {
    fun hello(name: String) {
        println("hello $name, this is my name ${this.name} ")
    }
}

class Manager(name: String) : Employee(name)
class VicePresident(name: String) : Employee(name)
class Boss(name: String) : Employee(name)

fun main() {

    val alfian = Manager("alfian")
    alfian.hello("silva")

    val aan = VicePresident("aan")
    aan.hello("Rahma")

    var employee = Employee("Eko")
    employee.hello("budi")

    employee = Manager("Eko")
    employee.hello("budi")

    employee = VicePresident("Eko")
    employee.hello("Budi")

}