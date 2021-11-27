open class Car(var brand: String, var model: String, var years: Int) {
    fun drive() {
        println("This car is safe drive!")
    }
}

fun typeObjectCar(any: Any) {
    if (any is Car) {
        println("Brand: ${any.brand}\n" +
                "Model: ${any.model}\n" +
                "Years: ${any.years}")
    }        }

fun main() {
    val toyota = Car("Toyota", "LGX", 1998)
    val ford = Car("Ford", "Super X", 2002)

    typeObjectCar(toyota)
    toyota.drive()
    println()
    typeObjectCar(ford)
    ford.drive()
}