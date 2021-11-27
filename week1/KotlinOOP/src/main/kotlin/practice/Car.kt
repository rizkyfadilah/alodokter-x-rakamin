package practice

class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    fun drive() {
        println("you drive with $brand $model year $year")
    }
}

fun main() {

    val alphard = Car()
    alphard.brand = "Toyota"
    alphard.model = "Alphard"
    alphard.year = 2020
    alphard.drive()

    val jazz = Car()
    jazz.brand = "Honda"
    jazz.model = "Jazz"
    jazz.year = 2021
    jazz.drive()

}