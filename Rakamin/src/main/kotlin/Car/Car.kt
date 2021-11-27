package Car

class Car {
    var brand : String = ""
    var model : String = ""
    var year : String = ""

    fun drive(){
        println("Drive safe!")
    }
}

fun main(){
    val suvCar = Car()
    val f1Car = Car()
    suvCar.brand = "Mercedes"
    suvCar.model = "C class"
    suvCar.year = "2019"

    f1Car.brand = "Mercedes AMG"
    f1Car.model = "W10 Beast Model"
    f1Car.year = "2021"
    println("This is Suv Car \nBrand : ${suvCar.brand} \nModel : ${suvCar.model} \nYear manufacture : ${suvCar.year}\n")
    println("This is F1 Car \nBrand : ${f1Car.brand} \nModel : ${f1Car.model} \nYear manufacture : ${f1Car.year}")

    suvCar.drive()
}