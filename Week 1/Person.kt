class Person {
    var firstName: String = ""
    var midName: String? = null
    var lastName: String? = ""

    var gender: String = ""
    var age: Int = 0
}

fun main() {
    val alvin = Person()
    alvin.firstName = "Alvin"
    alvin.lastName = "Tandiardi"
    alvin.gender = "Laki-Laki"
    alvin.age = 21



    println(alvin.firstName)
}