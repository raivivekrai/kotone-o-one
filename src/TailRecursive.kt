import java.math.BigInteger

//function calls itself from its body

fun main(args: Array<String>){

    var result = findFactorial(5)
    println(result)

    var bigResult = findBigFactorials(BigInteger("7000"), BigInteger("1"))
    println("Big result is $bigResult")

}

fun findFactorial(input: Int): Int {

    if (input == 0)
        return 1
    else
        return input*findFactorial(input-1)
}

/* the above kind of functions can get expensive on the memory stack and compiler as it makes a lot of data to be
stored in memory (the returns) we can optimize the function to not keep on storing data in the memory state while
 waiting for entire execution to be performed.
We can then add 'tailrec' keyword to the function to optimize the compiler as well*/

tailrec fun findBigFactorials(input: BigInteger, result: BigInteger): BigInteger{

    if (input == BigInteger("0") )
        return result
    else
        return findBigFactorials(input- BigInteger("1"), input*result)

}