abstract class Animal(val name: String)

class Tiger(name: String) : Animal(name)

fun main() {
//    val animal = Animal("lion") // error
    val tiger = Tiger("tiger")

}