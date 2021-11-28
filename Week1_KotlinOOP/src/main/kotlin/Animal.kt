abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Tiger(name: String) : Animal() {
    override val name: String
        get() = "Tiger"

    override fun run() {
        println("Running with speed 28km/s")
    }
}

fun main() {
//    val animal = Animal("Lion")
    val tiger = Tiger("Tiger")
    println(tiger.name)
    tiger.run()
}