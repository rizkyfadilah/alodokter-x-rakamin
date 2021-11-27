class Car(var name: String)
class Truck(var name: String)

fun typeObject(any: Any) {
    if (any is Car) {
        println("Car name is ${any.name}")
    } else if (any is Truck) {
        println("Truck name is ${any.name}")
    }
}

fun printString(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
    val car = Car("Bumble Bee")
    val truck = Truck("Optimus Prime")
    println(car.toString())

    typeObject(car)
    typeObject(truck)

    printString("Rizqan")
    printString(1)
}