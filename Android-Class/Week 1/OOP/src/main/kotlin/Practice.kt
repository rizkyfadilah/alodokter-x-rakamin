class CarPractice{
    var brand: String = ""
    var model: String = ""
    var year: String = ""
    var speed: String = ""

    fun drive(){
        println("This ${this.year} ${this.brand} ${this.model} sprints with top speed at ${this.speed}")
    }
}

fun main(){
    val aventador = CarPractice()

    aventador.brand = "Lamborgini"
    aventador.model = "Aventador"
    aventador.year = "2021"
    aventador.speed = "355 km/h"

    val gtr = CarPractice()

    gtr.brand = "Nissan"
    gtr.model = "Skyline GT-R R34"
    gtr.year = "2015"
    gtr.speed = "398 km/h"

    aventador.drive()
    gtr.drive()

}