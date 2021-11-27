interface Interaction {
    val name: String
    fun hello(name: String)
}

interface Go{
    fun running(){
        println("Running")
    }
}

class Human: Interaction {
    override val name: String = "Kotlin"
    override fun hello(name: String){
        println("Hello Human $name")
    }
}

fun main() {
    val human = Human()
    human.name
    human.hello("World")
}