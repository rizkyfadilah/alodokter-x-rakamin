data class Address(val domisili: String) {
    fun where(yourAddress: String) {
        println("I live in $domisili, but you live in $yourAddress")
    }

    fun where(yourAddress: String, yourUnit: String) {
        println("I live in $domisili, but you live in $yourAddress specifically $yourUnit")
    }
}