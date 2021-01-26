class Latte(
    override val sugar: Int,
    override val milk: Int,
) : Coffee(sugar, milk) {

    private val basePrice = 1.7

    val price: Double get() = basePrice + (sugar * 1.5) + (milk * 1.9)


    override fun toString(): String {
        return "Cappuccino: with $sugar and $milk"
    }

}
