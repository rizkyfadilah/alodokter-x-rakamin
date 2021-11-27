class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    val GENDER1: String = "Pria"
    val GENDER2: String = "Wanita"
    var gender: String = ""

    fun bioData():String{
        return "My name is $firstName $middleName $lastName. my gender $gender"
    }
}

fun main() {
    val adi = Person()
    val address = Address("kota bambu utara")
    adi.firstName = "Muhammad"
    adi.middleName = "Adi"
    adi.lastName = "Yusuf"
    adi.gender = adi.GENDER1

    println(adi.bioData())
    address.where("Puncak Bogor")
    where("Pekalongan")
}