interface Interaction {
    val name: String
    fun sayHello(name: String)
}
interface Go {
    fun running() {
        println("Running")
    }

}

class Human(override val name: String) : Interaction, Go {
    override fun sayHello(name: String) {
        println("hello $name my name is ${this.name}")
    }

}