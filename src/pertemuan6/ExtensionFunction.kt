package pertemuan6

fun String.greeding() : String {
    return "Hello, $this"
}

fun Int.isEven() : Boolean {
    return this % 2 == 0
}
fun main() {
    val username : String = "Samuel"
    val age : Int = 15
    println(username.greeding())
    println(age.isEven())
}