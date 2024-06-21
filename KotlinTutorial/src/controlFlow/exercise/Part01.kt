package controlFlow.exercise

fun main(){
    // Exercise 01
    val button: String = "A"
    val description = when(button){
        "A"-> "Yes"
        "B"->"No"
        "X"->"Menu"
        "Y"->"Nothing"
        else -> "There is no such button"
    }
    println(description)
}