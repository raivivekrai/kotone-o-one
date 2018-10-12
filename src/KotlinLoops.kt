//Print all even/odd numbers in the range of 1 to 10


fun main(args: Array<String>) {


//    for loop

    for (i in 1..10) {

        if (i % 2 == 0) {
            println("If is even $i")
        } else if (i % 2 != 0) {
            println("If is odd $i")
        }
    }

//    While loop

    var i = 1
    while (i <= 10) {
        if (i % 2 == 0) {
            println("While is even $i")
        } else if (i % 2 != 0) {
            println("While is odd $i")
        }
        i++
    }

//    Do While loop

    var j = 1
    do {
        if (j % 2 == 0) {
            println("Do While is even $j")
        } else if (j % 2 != 0) {
            println("Do While is odd $j")
        }
        j++
    } while (j <= 10)


}