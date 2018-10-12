


fun main(args: Array<String>) {

    var car1 = Car("Red", 15000)
    println(car1.carInfo())
    println(car1.cardBrand("Toyota"))


    var number1: Int = 5
    var number2: Int = 10

    number1.findMaximum(number2)

    number1 compareWith number2


}

class Car(val color: String, val price: Int) {

    fun carInfo(): String {
        return "Color = $color & Price = $price"
    }
}

// add an extension function to the Car Class to give out Brand.
// Without changing the class we can add the extension function to the class

fun Car.cardBrand(brand: String): String {

    return "Brand = $brand & Color = ${this.color} & Price = ${this.price}"
}

// how we can extend the Integer class. There are no primitive data types and all are classes and objects
fun Int.findMaximum(secondValue: Int) {

    if (this > secondValue) println("$this is greater than $secondValue")
    else println("$secondValue is lesser than $this")
}

/* Infix functions should be
member or extenbsion functions of a class
have single parameter
marked with 'infix' keyword
 */

infix fun Int.compareWith(secondValue: Int) {

    if (this < secondValue) println("$this is lesser than $secondValue")
    else println("$secondValue is greater than $this")
}