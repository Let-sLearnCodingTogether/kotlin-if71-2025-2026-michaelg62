package pertemuan5

fun main() {
    println("Siapa nama kamu ?")
    val name = readln()

    println("Umur Kamu ?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if(age != null) {
        println("Nama Kamu : $name")
        println("Umur Kamu : $age")
    } else {
        println("Umur tidak Valid")
    }
}