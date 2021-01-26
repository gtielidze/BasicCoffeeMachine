import java.util.*

fun main()  {
    val machine = CoffeeMachine(Scanner(System.`in`))
    val price = machine.request()
    println(price)


}
