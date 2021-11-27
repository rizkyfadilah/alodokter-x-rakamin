class Car(val name: String)
class Truck(val name: String)

fun typeObject(any: Any) {
    if (any is Car) {
        println("Print a car of ${any.name}")
    } else if (any is Truck) {
        println("Print a truck of ${any.name}")
    }
}

fun printString(any: Any){
    val value = any as? String
    println(value)
}

fun main(){
    val car = Car("Volvo")
    val truck = Truck("Hino")
    println(car.toString())

    typeObject(car)
    typeObject(truck)

    printString("Evandio")
    printString(123)
}