package pertemuan7

fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data"
    )
    println("List matakuliah wajib : $mataKuliahWajib")
    println("Size list matakuliah wajib : ${mataKuliahWajib.size}")

    println("Index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }

    println("List matakuliah uppercase : $mataKuliahUppercase")
}