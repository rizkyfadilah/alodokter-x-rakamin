class Person {
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""
    var address: String = ""
}

fun main(){
    val orang = Person()
    orang.firstName = "Rizqan"
    orang.midName = "Mubarak"
    orang.lastName = "Rahman"
    orang.address = "Cipinang Bali, Jakarta Timur"

    println(orang.firstName+orang.midName+orang.lastName)
    print(orang.address)
}