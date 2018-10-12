fun main(args: Array<String>) {

    var result = calculateSum(5, 10)
    println("Calculated Sum is $result")

    var opResult = calculateOp(19,7,5)
    println("Calculated operation result is $opResult")

}

fun calculateSum(number1: Int, number2: Int): Int {

    return number1 + number2
}

fun calculateOp(number1: Int, number2: Int, operation: Int) {

    when (operation) {
        1 -> println("Sum of the numbers $number1 and $number2 is : ${number1 + number2}")
        2 -> println("Subtraction of the numbers $number1 and $number2 is : ${number1 - number2}")
        3 -> println("Multiplication of the numbers $number1 and $number2 is : ${number1 * number2}")
        4 -> println("Division of the numbers $number1 and $number2 is : ${number1 / number2}")
        else -> println("Invalid Operation!!!")


    }

}

