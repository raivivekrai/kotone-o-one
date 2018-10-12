package kotoop

fun main(args: Array<String>){
    var lion = Lion()
    lion.color="Red"
    lion.legs=4
    lion.eat()

    var deer = Deer()
    deer.color = "Brown"
    deer.legs = 4
    deer.eat()
    deer.sleep()

    var animals = Animals()
    animals.color = "unknown"
    animals.legs = 4
    animals.eat()
    animals.toString()

    var tiger = Tiger()
    tiger.color = "Yellow"
    tiger.legs = 4
    tiger.dangerous = true
    tiger.age = 3
    tiger.eat()

}


/*
All classes are public and final by default,
to enable a class to be inherited from we need to specify it to be open
If no supertype is provided then default supertype is Any class
 */

open class Animals: Any(){
    var color: String = ""
    var legs: Int = 0

    fun eat(){

    }
}

/*
childclass:parentclass() -- or superclass, baseclass i.e. the class from where you want to inherit
If no supertype is provided then default supertype is Any() class
 */

open class Lion: Animals(){
   var dangerous: Boolean = false
    var age: Int = 0
}

class Tiger: Lion(){


}

class Deer: Animals(){


    fun sleep(){

    }
}