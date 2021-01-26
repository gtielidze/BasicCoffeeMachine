
class FilteredCoffee (
    private val sugar: Int,
    private val coffee: Int,

    ) {

    fun checkCoffee(){
        when (coffee) {
            in 0..5 -> print("x is in the range")
            else -> print("none of the above")

        }
    }

    private val basePrice = 1.5

    val price: Double get() = basePrice + (sugar * 1.5) + (coffee * 1.9)


    override fun toString(): String {
        return "FilteredCoffee: with $sugar and $coffee"
    }
}