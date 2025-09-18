package pertemuan3

fun main() {
    var totalBelanja : Double = 0.0
    println("Status Awal -> Total Belanja : $totalBelanja" )
    val belanja1 = 3*25000
    val belanja2 = 2*15000
    val diskon = 10000
    totalBelanja += belanja1
    println("Setelah Item A -> Total Belanja : $totalBelanja" )
    totalBelanja += belanja2
    println("Setelah Item B -> Total Belanja : $totalBelanja" )
    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja : $totalBelanja" )
    val biayaLayanan = totalBelanja/100
    totalBelanja += biayaLayanan
    println("Ditambah Biaya Layanan ($biayaLayanan) : Total Belanja $totalBelanja" )
    println(" Total Belanja Harus Dibayar : $totalBelanja" )



}