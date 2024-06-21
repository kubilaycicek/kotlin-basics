package lambdaExpressions

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun main() {
    uppercaseString("kubilay")

    val upperCaseString = { text: String -> text.uppercase() }
    val lowerCaseString = { text: String -> text.lowercase() }

    println(upperCaseString)
}