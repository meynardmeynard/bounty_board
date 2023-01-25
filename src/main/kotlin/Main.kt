const val HERO_NAME = "Madrigal"

fun main(args: Array<String>) {

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)
    var hasSteed = false;


    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel++
    println(playerLevel)
    if (hasSteed) {
        println(HERO_NAME+ " has steed")
    }
    else {
        println(HERO_NAME+ " doesn't have steed")
    }

}