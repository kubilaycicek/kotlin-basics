package functions

fun main() {
    hello()

    val name: String = "Kubilay"
    hello(name)
}

fun hello() {
    return println("Hello")
}

fun hello(name: String) {
    println("Hello $name")
}