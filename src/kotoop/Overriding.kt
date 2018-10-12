package kotoop

fun main(args: Array<String>) {

    var samsung = Samsung()
    //samsung.playVideo()
println(samsung.brand)


   // var nokia = Nokia()
   // nokia.playVideo()

}


//Super class

open class Phone {
    open var brand: String = " Phone"
    var price: Int = 0

    open fun playVideo() {
        println("Phone is playing video")

    }

}


//child class of phone
/* For overriding
1. Method must have same name and same parameter as parent class
2. Overridable members must be marked with open keyword
3. Add override keyword before overridden method
//to call method from superclass use super keyword
 */

class Samsung : Phone() {

    override var brand: String = "Samsung"
    override fun playVideo() {
        super.playVideo() //to call method from superclass
        println("Samsung is playing video")

    }


}


//child class of phone
class Nokia : Phone() {
    override fun playVideo() {
        println("Nokia is playing video")

    }


}
