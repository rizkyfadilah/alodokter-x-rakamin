class Address(val domisili: String) {
    fun where(yourAddress: String) {
        println("this is my address $domisili, and your address is $yourAddress")
    }
    fun where(yourAddress: String, yourUnit: String): Unit {
        println("this is my address $domisili, and your address is $yourAddress and live at $yourUnit")
    }
}

fun main() {
    val address = Address("makassar")
    address.where("pettarani")
    address.where("pettarani", "sukamulia")
}