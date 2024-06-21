package controlFlow.exercise

fun main() {
    var pizzaSlices = 7
    while (pizzaSlices > 0) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices--
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

/*
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices--
    } while (pizzaSlices > 0)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
*/
}