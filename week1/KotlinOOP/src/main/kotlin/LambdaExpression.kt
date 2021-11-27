fun main() {
    val lambdaName: (String) -> String = {value: String ->
        value.toUpperCase()
    }

    val name = lambdaName("alfian")
    println(name)

    val alfian = ::toUpper
    println(alfian("aan"))
}

fun toUpper(value: String): String = value.toUpperCase()