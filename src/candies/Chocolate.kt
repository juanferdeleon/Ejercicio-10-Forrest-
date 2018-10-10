package candies

class Chocolate (name: String, sugarQuant: Int, flavor: String, private val chocolateType: String, private val cacaoPercentage: Int): Candy(name, sugarQuant, flavor) {
    override fun toString(): String {
        return """

            Name: $name
            Sugar Quantity: $sugarQuant
            Flavor: $flavor
            Type of Chocolate: $chocolateType
            Cacao Percentage: $cacaoPercentage
        """.trimIndent()
    }
}