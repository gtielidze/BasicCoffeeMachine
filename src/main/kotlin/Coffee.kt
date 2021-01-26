abstract class Coffee(sugar: Int, milk: Int) {
    abstract val sugar: Int
    abstract val milk: Int

    /*fun ingredients(){
        println("your coffee with $sugar sugar and $milk milk is ready, bon appetite")
    } ეს ვერ გამოვიძახე მაინში*/

    init {
        println("your coffee with $sugar sugar and $milk milk is ready, bon appetite")
    }
}
