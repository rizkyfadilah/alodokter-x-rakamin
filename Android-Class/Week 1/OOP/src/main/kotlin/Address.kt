data class Address(val domisili: String) {
    fun where(yourAddress: String) {
        println("I live in $domisili, but you live in $yourAddress")
    }

    fun where(yourAddress: String, yourUnit: String) {
        println("I live in $domisili, but you live in $yourAddress specifically in $yourUnit")
    }
}

fun main(){
    val address = Address("Jakarta")
    address.where("Surabaya")
    address.where("Surabaya", "Pakuwon City")
}