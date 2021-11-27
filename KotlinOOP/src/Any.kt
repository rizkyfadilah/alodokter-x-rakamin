class Motorcycle(val name: String)
class Mobil(val name: String)
class Bike(val name: String)

fun main() {
    val motorcycle = Motorcycle("Honda CRF")
    val mobil = Mobil("Toyota Camry")
    val bike = Bike("Wimcycle")

    println(motorcycle)
    println(motorcycle.toString())

    typeObj(motorcycle)
    typeObj(mobil)
    typeObj(bike)

    printStr("Rizqan")
    printStr(123)
}

fun printStr(any: Any){
    val value = any as? String
    println(value)
}

fun typeObj(any: Any){
    when(any) {
        is Motorcycle -> {
            println("Print a motorcycle of ${any.name}")
        }
        is Mobil -> {
            println("Print a mobil of ${any.name}")
        }
        else -> {
            println("Print $any")
        }
    }
}