fun upper(value: String): String = value.toUpperCase()

fun main() {
    val simpleLambda: (String) -> String = ::upper

    val lambda = simpleLambda("Evandio")
    println(lambda)
}