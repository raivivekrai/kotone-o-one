fun main(args: Array<String>) {

//    Break Statement
// labelling the loop
    LoopToBreak@ for (j in 1..2) {
        for (i in 1..10) {
            println("$j $i")
            if (i == 5) {
                println("Value has reached 5")
                break@LoopToBreak
            }
        }

    }

//    Continue Statement
    for (j in 1..10){
        if (j == 5){
            continue // skips code right after this statement
        }
        println("Value of j is $j")
    }
}