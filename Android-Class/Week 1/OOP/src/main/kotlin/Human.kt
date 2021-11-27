interface Interaction {
    val name: String
    fun hello(name: String)
    fun touch(){
        println("this is concrete function")
    }
}

interface Go{
    fun running(){
        println("Running")
    }
}

interface Stop{
    fun stopping(){
        println("Stopping")
    }
}

class Human: Interaction, Go, Stop {
    override val name: String = "Kotlin"
    override fun hello(name: String){
        println("Hello Human $name")
    }

    override fun running() {
        super<Go>.running()
        super<Stop>.stopping()
    }
}

fun main() {
    val human = Human()
    human.name
    human.hello("World")
    human.touch()
    human.running()
}