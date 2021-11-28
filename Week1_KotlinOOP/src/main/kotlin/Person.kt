class Person {
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""
    var gender: String = ""
}

fun main() {
    val febian = Person()
    febian.firstName = "Febian"
    febian.midName = "Joshua"
    febian.lastName = "Reynara"
    febian.gender = "Laki-laki"

    println(febian.firstName)
}