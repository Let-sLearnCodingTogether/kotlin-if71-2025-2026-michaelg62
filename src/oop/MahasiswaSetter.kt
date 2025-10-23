class Mahasiswa2(ipk: Double) {
    var ipk: Double = 0.0
        set(value) {
            field = if (value < 0){
                0.0
            } else if (value > 4.0){
                4.0
            } else {
                value
            }
        }

    init {
        this.ipk = ipk
    }
}

fun main() {
    var ipk2 = Mahasiswa2(4.5)
    println(ipk2.ipk)
    ipk2 = Mahasiswa2(-0.1)
    println(ipk2.ipk)
}