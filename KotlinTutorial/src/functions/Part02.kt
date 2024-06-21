package functions



fun main() {


    printMessageWithPrefix("Hello")
    printMessageWithPrefix("Hello","Log")
    printMessageWithPrefix(prefix = "Log", message = "Hello")

}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}