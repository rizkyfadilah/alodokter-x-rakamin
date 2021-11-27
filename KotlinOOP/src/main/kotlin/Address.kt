
data class Address(val domisili: String){
    fun where(yourAddress: String){
        println("this is my address $domisili, and your address is $yourAddress")

    }
    fun where(yourAddress: String, yourUnit: String){
        println("this is my address $domisili, and your address is $yourAddress,and $yourUnit")
    }
}