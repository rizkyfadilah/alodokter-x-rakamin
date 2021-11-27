package latihan

class Car(var brand: String, var model: String, var year: Int) {
    fun drive(){
        print("You're drive with ")
    }
}

fun typeObjectCar(any: Any){
    if(any is Car){
        println("${any.brand} ${any.model} (${any.year})\n")
    }
}

fun main(){
    val car1 = Car("Mitsubishi", "Lancer Evolution X", 2016)
    val car2 = Car("Toyota", "Celica", 2006)

    car1.drive()
    typeObjectCar(car1)

    car2.drive()
    typeObjectCar(car2)

}