class Person{
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""

    var gender: String = ""
}

fun main(){
    val evandio = Person()
    evandio.firstName = "Evandio"
    evandio.midName = "Martin"
    evandio.lastName = "Batti"
    evandio.gender = "Laki-laki"

    println(evandio)
}