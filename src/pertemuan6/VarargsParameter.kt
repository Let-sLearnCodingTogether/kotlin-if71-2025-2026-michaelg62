package pertemuan6

fun tugas(user: Array<String>) {
    for (nama in user) {
        println(nama)
    }
}
fun main() {
    tugas(user = arrayOf("Cupi", "Cupo", "Cupe"))
}