package controlFlow

fun main(){
    val temp = 15
    val text = when {
        temp < 0 -> "Very Cold"
        temp < 10 -> "A bit cold"
        temp < 20 -> "Warm"
        else -> "Hot !"
    }

    println(text)
}