package oop

data class Garneltem(
    val id : Int,
    val name : String,
    val value : Int,
    val rarity : String
)

fun main() {
    val item = listOf<Garneltem>(
        Garneltem(1,"Pedang Besi", 100, "Common"),
        Garneltem(2,"Ramuan Kesehatan", 50, "Common"),
        Garneltem(3,"Jumah Bayangan", 500, "Epic"))

}