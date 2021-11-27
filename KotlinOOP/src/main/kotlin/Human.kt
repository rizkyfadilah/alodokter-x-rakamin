interface Interaction {
    val name: String
    fun hello(name: String)
    fun touch() {
        println("this is concreate function")

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





class Human: Interaction,Go, Stop {
    override val name: String = "Human"
    override fun hello(name: String) {
        println("hello Human $name")
    }

    override fun running(){
        super<Go>.running()
        super<Stop>.running()

    }

}

fun main(){
    val human = Human()
    human.name
    human.hello("World")
    human.touch()
    human.running()

}