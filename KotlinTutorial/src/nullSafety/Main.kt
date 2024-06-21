package nullSafety

fun main() {
    var neverNull: String = "This can't be null"

    //neverNull = null

    var nullable: String? = "You can keep a null here"

    nullable = null

    val nullString: String? = null
    println(nullString)

    val name: String? = null
    println(name?.uppercase())
    println(nullString?.length ?: 0)
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}