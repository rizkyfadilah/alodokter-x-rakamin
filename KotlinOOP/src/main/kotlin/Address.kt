data class Address(val domisili:String) {
    fun where(yourAddress: String){
        println("ini tempat tinggal saya $domisili, dan tempat tinggal kamu $yourAddress.")
    }

    fun where(yourAddress: String, homeNumber: String){
        println("ini tempat tinggal saya $yourAddress Nomor Rumah $homeNumber.")
    }
}

//dapat diakse oleh siapapun
fun where(yourAddress: String){
    println("ini tempat tinggal saya $yourAddress.")
}