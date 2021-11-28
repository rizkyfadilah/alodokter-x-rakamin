fun upper(value: String): String = value.uppercase()

fun main() {
    val lambdaName: (String) -> String = { value: String ->
        value.uppercase()
    }
    val lambdaName1: (String) -> String = ::upper

    println(lambdaName("febian"))
}