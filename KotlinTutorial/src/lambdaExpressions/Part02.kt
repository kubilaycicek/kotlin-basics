package lambdaExpressions

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, -1, -2, -3, -4, -5)

    val negatives = numbers.filter { x -> x < 0 }
    val positives = numbers.filter { x -> x > 0 }

    val doubled = numbers.map { x -> x * 2 }
    println(doubled)

    val maxValue = numbers.max();



}
