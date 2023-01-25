const val HERO_NAME = "Madrigal"

fun main(args: Array<String>) {

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)
    var hasSteed = false
    val pubName = "The Unicorn\'s Horn"
    val publican = "Rome"
    var heroGold = 50
    val drinks: List<String> = listOf("Mead", "Wine", "La Croix")

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel++
    println(playerLevel)
    if (hasSteed) {
        println("$HERO_NAME has steed")
    }
    else {
        println("$HERO_NAME doesn't have steed")
    }

    println("Welcome to $pubName, I\'m $publican your publican.")
    println("$HERO_NAME has $heroGold gold")
    println("Here's our available drinks")
    for (d in drinks) { println("$d") }
}