package pertemuan1

fun main() {
    // default dari trimMargin menggunakan prefix pipe "|"
    val university : String = "Universitas Multi Data Palembang"
    val address : String = """
        |Jln. Rajawali
        |Sumatera Selatan
        |Palembang
    """.trimMargin()

    // custom prefix dari trim margin
    val address2 : String = """
        -Jln. Rajawali
        -Sumatera Selatan
        -Palembang
    """.trimMargin("-")

    // trimIndent
    val address3 : String = """
        Jln. Rajawali
        Sumatera Selatan
        Palembang
    """.trimIndent()

    println(university)
    println(address)
    println(address2)
    println(address3)
}