class Person {
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""
    var gender: String = ""
}

fun main() {
    val alfian = Person()
    alfian.firstName = "alfian"
    alfian.lastName = "aan"
    alfian.gender = "laki-laki"
    println(alfian.firstName)
}