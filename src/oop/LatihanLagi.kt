package oop

data class Player(
    val name : String,
    var health : Int = 100,
    var level : Int = 1) {

    fun takeDamage(damage: Int) {
        if (health >= damage) {
            health -= damage
        } else {
            health = 0
        }

    }

    fun levelUp(){
        level += 1
        health = 100
    }

    fun showStatus(){
        println("Nama : $name")
        println("Level : $level")
        println("Health : $health")
    }

}
fun main() {

    val player = Player("Michael")
    player.showStatus()
    player.takeDamage(30)
    player.showStatus()
    player.levelUp()
    player.showStatus()

}