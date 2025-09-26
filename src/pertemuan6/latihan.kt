package pertemuan6

fun hitungPanjangNama(name: String?): Int {
    return name?.length ?: 0
}

fun main() {
    println(hitungPanjangNama("Michael"))
    println(hitungPanjangNama(null))
}