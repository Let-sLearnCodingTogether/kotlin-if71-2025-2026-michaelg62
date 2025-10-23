package oop

class PersegiPanjang(val panjang : Double, val lebar : Double){
    val luas : Double
    get() = panjang*lebar
}


fun main() {
    val luasPersegiPanjang = PersegiPanjang(10.1, 5.6)
    println(luasPersegiPanjang.luas)
}