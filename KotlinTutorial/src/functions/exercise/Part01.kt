package functions.exercise

import kotlin.math.PI


fun circleArea(r: Int): Double {
    return PI * r * r
}

fun main() {
    println(circleArea(2))
}