class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int? = 0

    fun drive() {
        println("This car is from $brand. The model name is $model, and made in $year")
    }
}

fun main() {
    val toyota = Car()
    val suzuki = Car()

    toyota.brand = "Toyota"
    toyota.model = "Avanza"
    toyota.year = 2021

    suzuki.brand = "Suzuki"
    suzuki.model = "Ertiga"
    suzuki.year = 2020

    toyota.drive()
    suzuki.drive()
}