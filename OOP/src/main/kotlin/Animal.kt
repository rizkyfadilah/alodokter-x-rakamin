abstract class Animal{
    abstract val name: String
    abstract fun run()
}

class Tiger(name: String): Animal() {
    override val name: String = "Tiger"
    override fun run() {
        println("Running with speed 26 km/h")
    }
}

fun main(){
    val tiger = Tiger("Tiger")
}