class Car(val name: String)
class Truck(val name: String)
class Bike(val name: String)

fun main() {
    val car = Car("BMW")
    val truck = Truck("Hino")
    val bike = Bike("BMX")

    println(car)
    println(car.toString())

    typeObject(car)
    typeObject(truck)
    typeObject(bike)

    printString("Dino")
    printString(123)
}

fun printString(any: Any){
    val value = any as? String
    println(value)
}

fun typeObject(any: Any){
    when(any) {
        is Car -> {
            println("Print a car of ${any.name}")
        }
        is Truck -> {
            println("Print a truck of ${any.name}")
        }
        else -> {
            println("Print $any")
        }
    }
}