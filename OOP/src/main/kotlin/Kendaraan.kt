class Car(name: String)
class Truck(name: String)

fun typeObject(any: Any) {
    if (any is Car) {
        println("Print a car of $any")
    } else if (any is Truck) {
        println("Print a truck of $any")
    }
}

fun print(){

}

fun main(){
    val car = Car("Volvo")
    val truck = Truck("Hino")
    println(car.toString())

    typeObject(car)
    typeObject(truck)
}