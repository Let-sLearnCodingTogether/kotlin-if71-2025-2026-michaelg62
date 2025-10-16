package oop

class MahasiswaConstructor(
    val npm : String,
    val nama: String,
    var ipk: Float
)
val mahasiswaPertama = MahasiswaConstructor(
    "2226250062",
    "mahasiswa1",
    3.5f
)
fun main() {
   println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)
}