fun main(args: Array<String>){
   var result = subtract(10,5)
    println(result)

    var conciseResult = subtractConcise(5,10)
    println("Concise result is $conciseResult")

}

fun subtract(a: Int, b: Int): Int{

    if (a>b){
        return a - b
    }
    else {

        return b - a
    }
}
// function as an expression
fun subtractConcise(a: Int, b: Int) = if (a > b)  a - b  else  b - a


