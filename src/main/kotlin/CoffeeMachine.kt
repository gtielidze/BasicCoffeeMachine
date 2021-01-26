import java.util.*


class CoffeeMachine(
    private val scanner: Scanner,
) {


    fun request(): Double {
        println("Please Enter Coffee Type(Available Types: latte, cappuccino, filtredcoffee)")
        return when (scanner.next()) {
            "latte" -> Latte(requestSugar(), requestMilk()).price
            "cappuccino" -> Cappuccino(requestSugar(), requestMilk(), hasCinnamon()).price
            "filtredcoffee" -> FilteredCoffee(requestCoffee(), requestSugar()).price
            else -> {
                println("unknown coffee type")
                return 0.0
            }
        }
    }


    private fun hasCinnamon(): Boolean {
        print("Do you want cinnamon: ")
        return scanner.nextBoolean()
    }

    private fun requestSugar(): Int {
        print("Please Enter Sugar Quantity : ")
        return when (val sugar = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }
    }

    private fun requestCoffee(): Int {
        print("Please Enter Coffee Quantity from 1 to 5: ")
        return when (val coffee = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> coffee
        }
    }

    private fun requestMilk(): Int {
        print("Please Enter Milk Quantity : ")
        return when (val sugar = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }
    }


}