interface Interaction{
    val name: String
    fun hello(name: String)
    fun touch(){
        println("This is concrete function")
    }
}

interface Go{
    fun running(){
        println("Running")
    }
}

interface Stop{
    fun running(){
        println("Stopping")
    }
}

class Human: Interaction, Go, Stop {
    override val name: String = "Human"

    override fun hello(name: String) {
        println("Hello Hooman $name")
    }

    override fun running() {
        super<Go>.running()
        super<Stop>.running()
    }
}

fun main() {
    val human = Human()
    human.name
    human.hello("World")
    human.touch()
    human.running()
}