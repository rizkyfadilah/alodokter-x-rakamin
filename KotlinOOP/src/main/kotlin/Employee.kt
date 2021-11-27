open class Employee(val name:String) {
    fun hello(name:String){
        println("hello $name, this is my name ${this.name}")
    }
    open fun salary(name:String, salary:String){
        println("hello $name, salary $salary")
    }
}

class Manager(name: String):Employee(name){
    fun hello(name: String, old:String){
        println("hallo nama saya $name umur $old")
    }

    override fun salary(name: String, salary: String) {
        println("hai $name, gaji $salary")
    }
}
class VicePresident(name: String):Employee(name)
class Boss(name: String):Employee(name)

fun main(){
    val adi = Manager("adi")
    adi.hello("anna")
    adi.hello("Muhammad Adi Yusuf","22")
    adi.salary("adi","5500000")

    val yusuf = VicePresident("yusuf")
    yusuf.hello("anna")
}