class Address(val domisili: String) {

    fun where(yourAddress: String) {
        println("This is my address $domisili, and your address is $yourAddress")
    }

    fun where(yourAddress: String, yourUnit: String) {
        println("This is my address $domisili, and your address is $yourAddress,and $yourUnit")
    }

}

fun main() {
    val address = Address("Jakarta")
    address.where("Yogyakarta")
}