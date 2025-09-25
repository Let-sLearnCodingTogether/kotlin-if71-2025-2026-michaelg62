package pertemuan5

fun main() {
    println("Siapa nama Petualamg kamu?")
    val namaPemain = readln()
    var kesehatanPemain : Int = 100
    var punyaKunciEmas : Boolean = false
    var jumlahPotion : Int = 2

    var sedangBermain : Boolean = true

    while (sedangBermain){
        println("\nStatus Permainan:")
        println("Nama Pemain: $namaPemain")
        println("Kesehatan Pemain: $kesehatanPemain")
        println("Jumlah Potion: $jumlahPotion")
        println("Punya Kunci Emas: $punyaKunciEmas")


        println("\nDidepan kamu terdapat 2 buah jalur:(1,2)")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1 atau 2): ")

        val pilihanJalurInput = readln()
        val pilihanJalur = pilihanJalurInput.toIntOrNull()

        when(pilihanJalur){
            1 -> {
                println("\n Kamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")
                println("Pilih patung (naga, griffin, ular):")
                val pilihPatung = readln()
                when (pilihPatung) {
                    "naga" -> {
                        println("Nago niup api ke kau, darah kau berkurang 35 poin.")
                        kesehatanPemain -= 35
                    }
                    "griffin" -> {
                        println("Griffin kasih kunci emas, dapat kunci emas deh bisa pergi")
                        punyaKunciEmas = true
                    }
                    "ular" -> {
                        println("Ulo geget kau, Darah kau berkurang 15 poin.")
                        kesehatanPemain -= 15
                    }
                    else -> {
                        println("Salah Jawab Bos, Tidak ada yang terjadi.")
                    }

                }
                if (kesehatanPemain > 0) {
                    println("\nApakah kamu ingin menggunakan potion untuk menambah kesehatan? (y/n)")
                    val gunakanPotion = readln()

                    if (gunakanPotion == "y" && jumlahPotion > 0) {
                        kesehatanPemain += 10
                        if (kesehatanPemain > 100) kesehatanPemain = 100
                        jumlahPotion -= 1
                        println("Potion digunakan. Kesehatan kamu sekarang: $kesehatanPemain")
                    } else if (gunakanPotion == "y" && jumlahPotion == 0) {
                        println("Kamu tidak memiliki potion!")
                    }
                }
                if (punyaKunciEmas) {
                    println("\nKamu menggunakan kunci emas dan menemukan artefak kuno! Permainan selesai.")
                    sedangBermain = false
                } else {
                    println("\nPintu terkunci dan membutuhkan kunci emas. Permainan selesai.")
                    sedangBermain = true
                }

            }
            2 -> {
                println("\nKamu menginjak perangkap! Kesehatan kamu berkurang 25 poin.")
                kesehatanPemain -= 25
            }

        }
        if (kesehatanPemain <= 0) {
            println("\nKesehatan kamu habis! Permainan selesai.")
            sedangBermain = false
            continue
        }



    }

}