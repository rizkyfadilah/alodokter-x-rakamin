package practice

class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    fun drive(){
        println("Drive $model $brand car")
    }
}

fun main() {
    val carOne = Car()
    carOne.brand = "BMW"
    carOne.model = "M4"
    carOne.year = 2021

    val carTwo = Car()
    carTwo.brand = "Toyota"
    carTwo.model = "Avanza"
    carTwo.year = 2000

    println("Brand: ${carOne.brand}, Model: ${carOne.model}, Year: ${carOne.year}")
    println("Brand: ${carTwo.brand}, Model: ${carTwo.model}, Year: ${carTwo.year}")
    carOne.drive()
    carTwo.drive()
}