abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Tiger(name: String) : Animal() {
    override val name = "Tiger"

    override fun run() {
        println("Tiger is running")
    }
}

fun main() {
    val tiger = Tiger("Tiger")
    tiger.run()
}