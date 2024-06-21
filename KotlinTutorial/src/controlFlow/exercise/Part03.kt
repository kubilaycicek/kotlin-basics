package controlFlow.exercise

fun main() {
    for (number in 1..100)
        when {
            number % 3 == 0 -> println("fizz")
            number % 5 == 0 -> println("buzz")
            number % 15 == 0 -> println("fizzbuzz")
            else -> println("$number")
        }
}