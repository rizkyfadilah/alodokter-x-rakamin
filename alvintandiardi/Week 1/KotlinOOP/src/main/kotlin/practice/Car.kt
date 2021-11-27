package practice

class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    fun drive() {
        println("Driving with $brand $model Car Year $year")
    }
}

fun main() {
    val avanza = Car()
    avanza.brand = "Toyota"
    avanza.model = "Avanza"
    avanza.year = 2020
    avanza.drive()

    val brio = Car()
    brio.brand = "Honda"
    brio.model = "Brio"
    brio.year = 2019
    brio.drive()
}