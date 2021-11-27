fun main() {
    val lambdaName2: (String) -> String = ::toUpper

    //Lambda with Input
    val lambdaName: (String) -> String = { value ->
        value.toUpperCase()
    }

    //Lambda without input
    val lambdaEmpty: () -> String = {
        "test"
    }

    println(lambdaName("dino"))
    println(lambdaEmpty())
    println(lambdaName2("halo"))
}

fun toUpper(value: String): String = value.toUpperCase()