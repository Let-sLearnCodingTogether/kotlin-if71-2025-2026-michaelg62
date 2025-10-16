package oop

class MahasiswaConstructorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
){
    init{
        println("Ini Block Init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        "2226250034",
        "Mahasiswa Peratama"
    )

    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        "2226250034",
        "Mahasiswa Peratama"
    )
}