package functions.exercise


fun intervalInSeconds(hours: Int, minutes: Int, seconds: Int) = ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(hours = 1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, minutes = 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(hours = 1, 0, seconds = 1))
}

fun intervalInSecons(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds;