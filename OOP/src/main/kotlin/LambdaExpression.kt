fun upper(value: String): String = value.toUpperCase()

fun main() {
    val simpleLambda: (String) -> String = ::upper

    val lambdaName: (String) -> String = { value : String ->
        value.toUpperCase()
    }

    val lambda = lambdaName("Evandio")
    println(lambda)
}