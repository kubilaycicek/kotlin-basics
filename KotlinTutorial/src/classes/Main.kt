package classes


class Customer(val id: Int, val name: String, val surname: String)

class Contact(val id: Int, var email: String) {
    val category: String = ""

    fun printId() {
        println(id)
    }
}

data class Member(val id: Int, val name: String, val surname: String)

fun main() {
    val contact = Contact(1, "kubilay@gmail.com")
    println(contact.email)

    contact.email = "kubilaycicek@gmail.com"
    println(contact)
    println("My Email Address is :$(contact.email)")
    println(contact.printId())

    val member = Member(1, "Kubilay", "Çiçek")
    println(member)


    val secondMember = Member(2, "Sevilay", "Çiçek")
    val thirdMember = Member(2, "Sevilay", "Çiçek")


    println("member == secondMember: ${member === secondMember}")
    println("secondMember == thirdMember: ${secondMember === thirdMember}")

    println(member.copy())


}