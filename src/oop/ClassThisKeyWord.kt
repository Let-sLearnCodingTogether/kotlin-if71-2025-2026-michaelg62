package oop

class MahasiswaThisKeyword(val nama : String){
    fun sayGoodBye(nama : String){
        println("$nama : ${this.nama}")

    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyword(
        "Mahasiswa Pertama"
    )
    mahasiswaPertama.sayGoodBye("Mahasiswa 1")
}