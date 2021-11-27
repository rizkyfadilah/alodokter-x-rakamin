abstract class Animal() {
    abstract val name: String
    abstract fun run()
}
class Tiger(): Animal() {
    override val name: String = "Tiger"

    override fun run() {
        println("Fast")
    }
}

fun main() {

//    val animal = Animal()
    val tiger = Tiger()
    tiger.run()

}