package pertemuan4

fun main () {
    val finalExam = 'A'

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }
    when(finalExam) {
        'A','B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }
    when {
        finalExam =='A' || finalExam == 'B' -> println("Lulus")
        finalExam =='C' -> println("Ya bisa lulus")
        else ->println("Tidak Lulus")
    }
    var contoh  = 5

    when{
        (contoh > 0) -> contoh = 10
    }
    println(contoh)
}
