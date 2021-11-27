fun upper(value: String): String = value.toUpperCase()

fun main() {
    val lambdaName: (String) -> String = ::upper

    val lambdaEmpty: () -> String = {
        "Test Kosong"
    }

    val lambda = lambdaName("alvin")
    println(lambda)
    println(lambdaEmpty())
}