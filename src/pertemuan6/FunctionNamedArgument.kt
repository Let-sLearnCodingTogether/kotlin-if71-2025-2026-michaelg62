package pertemuan6

fun calculate(
    tugas1: Double,
    tugas2: Double,
    kuis1: Double,
    kuis2: Double,
    uts: Double,
    uas: Double
) {
    println(kuis1 + kuis2 + tugas1 + tugas2 + uts + uas)
}
fun main() {
    calculate(
        kuis1 = 10.6,
        uts = 100.0,
        uas = 100.0,
        tugas1 = 10.0,
        tugas2 = 10.6,
        kuis2 = 20.5)
}