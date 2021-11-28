data class Car(
    var brand: String,
    var model: String,
    var year: Int
) {
    fun drive() {
        println("Driving ${this.brand} car")
    }
}

fun main() {
    val mazdaCar = Car(
        brand = "Mazda",
        model = "Sedan",
        year = 2017
    )

    println(mazdaCar.brand)
    println(mazdaCar.model)
    println(mazdaCar.year)
    mazdaCar.drive()
}