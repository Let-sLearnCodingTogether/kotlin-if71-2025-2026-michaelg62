package pertemuan7

fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data"
    )

    val mataKuliahPilihan : MutableList<String> = mutableListOf(
        "Kotlin",
        "Logika Fuzzy"
    )

    mataKuliahPilihan.add("Web 2")

    println(mataKuliahPilihan[0])
    println(mataKuliahPilihan[1])
    println(mataKuliahPilihan[2])

    mataKuliahPilihan.add(1, "Web 1")
    println(mataKuliahPilihan[1])

    mataKuliahPilihan.removeAt(1)
    println(mataKuliahPilihan)

    val mataKuliah = mataKuliahPilihan +  mataKuliahWajib
    println(mataKuliah)
}