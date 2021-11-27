fun upper(value: String): String = value.toUpperCase()

fun main() {
    val lambdaName: (String) -> String = ::upper

    val lambdaEmpty: () -> String = {
        "Test empty"
    }

    val lambda = lambdaName("rizQan")
    println(lambda)
    println(lambdaEmpty())
}