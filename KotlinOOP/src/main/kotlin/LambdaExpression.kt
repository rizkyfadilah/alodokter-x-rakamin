fun upper(value: String):String = value.uppercase()

fun main(){

    val lambdaName: (String) -> String ={ value:String ->
        upper(value)

    }

    val lambdaName1: (String) -> String = ::upper

    val lambdaEmpty: () -> String = {
        "test"
    }

    val lambda = lambdaName("randy")
    println(lambda)
    println(lambdaEmpty())
}