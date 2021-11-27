class Cars(val name: String)
class Truck(val name: String)

fun typeObject(any: Any) {

    if (any is Cars) {
        println("car ${any.name}")
    }else if (any is Truck) {
        println("truck ${any.name}")
    }

}

fun printString(any: Any) {
    val value = any as String
    println(value)
}
fun printStringNull(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
    val car = Cars("Volve")
    println(car.toString())
    val truck = Truck("Hino")
    typeObject(car)
    typeObject(truck)

    printString("alfian")

    printStringNull(1)
}