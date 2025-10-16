package oop

class MahasiswaFunctionOverLoading(val nama : String){
    fun sayHello(){
        println("Selamat malam $nama")
    }
    fun sayHello(word : String){
        println("$word $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunctionOverLoading("Mahasiswa")

    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Pagi")
}