interface Interaction {
    val name: String
    fun hello()
    fun welcome() {
        println("Welcome $name")
    }
}

interface Go {
    fun running(){
        println("Run")
    }
}

interface Stop {
    fun running(){
        println("Stop")
    }
}

class Human: Interaction, Go, Stop {
    override val name: String = "Rizqan"
    override fun hello() {
        println("Hello ${this.name}")
    }

    override fun running() {
        super<Go>.running()
        super<Stop>.running()
    }
}

fun main() {
    val human = Human()
    human.name
    human.hello()
    human.welcome()
    human.running()
}