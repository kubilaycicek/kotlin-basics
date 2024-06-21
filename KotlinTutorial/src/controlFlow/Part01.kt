package controlFlow

fun main() {
    val flag: String = "Red"

    if (flag == "Red") println("Stop!")
    else println("Go!")

    val message = "Hello"

    val result = when (message) {
        "Go" -> "Stop"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }

    println(result)
    println("$result")




}