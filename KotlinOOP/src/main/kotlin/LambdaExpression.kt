fun upperCase(value:String):String=value.uppercase()

fun main(){
    val lambdaNameExternal:(String)->String=::upperCase

    val lambdaName:(String)->String ={value:String ->
        value.uppercase()
    }

    val lambdaEmpty:()->String ={
        "adi "
    }

    val name = lambdaName("adi")

    println(name)
    println(lambdaEmpty())
    println(lambdaNameExternal("yuhu"))
}