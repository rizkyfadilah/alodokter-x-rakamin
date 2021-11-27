class Person {
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""
    var address: String = ""
    var age: Int = 0
}

fun main() {
    val dino = Person()
    dino.apply {
        firstName = "Dino"
        midName = "Akbar"
        lastName = "Pratondo"
        address = "Jl. Anggrek no.7 Kebon Jeruk, Kelapa Dua, JakBar"
        age = 22
    }
    println(dino.firstName)
}