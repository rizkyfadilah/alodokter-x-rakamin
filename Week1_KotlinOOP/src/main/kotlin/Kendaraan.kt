class CarClass(val name: String) //-> Any class
class Truck(val name: String)

fun typeObject(any: Any) {
    when (any) {
        is CarClass -> println("Print a car of ${any.name}")
        is Truck -> println("Print a truck of ${any.name}")
        else -> println(any)
    }
}

//unsafe cast
fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun main() {
    val car = CarClass("Volvo")
    val truck = Truck("Hino")
    println(car.toString())

    typeObject(car)
    typeObject(truck)
}