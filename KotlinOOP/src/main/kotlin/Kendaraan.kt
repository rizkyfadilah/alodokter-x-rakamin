class Car(val name:String)
class Truck(name: String)

fun typeObject(any:Any){
    if (any is Car){
        println("Car ${any.name}")
    }else if(any is Truck){
        println("Truck $any")
    }else{
        println("anda kurang beruntung")
    }
}

fun printString(any:Any){
    val value = any as String
    println(value)
}

fun printStringNullAble(any:Any){
    val value = any as? String
    println(value)
}

fun main(){
    val car = Car("toyota")
    val truck = Truck("daihatsu")

    println(car.toString())

    typeObject(car)
    typeObject(truck)

    printString("adi")
    printString("123")
//    printString(123) //gak boleh selain string karena udah didefinisikan balikannya string


}