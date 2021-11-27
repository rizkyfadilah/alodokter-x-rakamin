
class Person{
    var firstname: String =""
    var midname: String? = null
    var lastname: String =""

    var gender: String =""

}

fun main(){
    val randy = Person()
    randy.firstname = "Randy"
    randy.lastname = "Adityanda"
    randy.gender = "Laki-laki"
    println(randy.firstname)

}