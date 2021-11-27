open class Employee(val name: String) {
    open fun hello(name : String) {
        println("hello $name, this is my name ${this.name}")
    }
}

class Manager(name: String): Employee(name){
    fun parking(){

    }

    override fun hello(name: String){
        println("hello $name, this is my manager name ${this.name}")
    }
}
class VicePresident(name: String): Employee(name)
class Boss(name: String): Employee(name)

fun main(){
    val randy = Manager("Randy")
    randy.hello("Ridho")
    randy.parking()

    val nana = VicePresident("nana")
    nana.hello("Ridho")

}