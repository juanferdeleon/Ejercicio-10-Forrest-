import People.ForestGump
import candies.Chocolate
import candies.RandomBox

fun main(args: Array<String>) {

    val boxOfChocolate = RandomBox<Chocolate>(arrayListOf<Chocolate>(
            Chocolate("Chocolate1", 100, "Almendra", "Dark", 75),
            Chocolate("Chocolate2", 67, "Nueces", "White", 0),
            Chocolate("Chocolate3", 10, "Galleta", "Dark", 80)
    ))

    val forestGump = ForestGump<Chocolate>(boxOfChocolate)
    println(forestGump.talkForest())
    println(forestGump.talkForest())
    println(forestGump.talkForest())
    println(forestGump.talkForest())
    println(forestGump.talkForest())
}