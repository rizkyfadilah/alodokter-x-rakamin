abstract class Animal() {
    abstract val name: String
    abstract fun run()
}
class Cheetah(): Animal() {
    override val name: String = "Cheetah"

    override fun run() {
        println("Fast")
    }
}

fun main() {
    val animal1 = Cheetah()
    print(animal1.name+" can run ")
    animal1.run()

}