package pertemuan6

infix fun String.to(type : String) : String {
    if(type == "UPPERCASE") {
        return this.uppercase()
    }
    return this.lowercase()
}

fun main() {
    println("hello world" to "upper")
    println("HELLO WORLD" to "lower")
}