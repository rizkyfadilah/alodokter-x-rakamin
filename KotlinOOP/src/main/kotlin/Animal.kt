abstract class Animal(){
    abstract val name: String
    abstract fun run()

}
class Tiger(name:String): Animal(){
    override val name: String = "Tiger"
    override fun run() {
        println("Running with speed 20km/h")
    }

}

fun main(){
//    val animal = Animal("Kucing")
    val tiger = Tiger("Kucing")
    println(tiger.name)
    tiger.run()
}