package kotoop

fun main(args: Array<String>){

    var cat = Animal("wild cat", "Blue", true)
    //println("the name of the cat is ${cat.name}")
}


class Animal(var name: String = "homely cat"){

    var dangerous: Boolean = false
    var color: String = "Red"

    //use init block to perform initialization stuff if needed
    init {
        println("Init values name = ${this.name}, Color = ${this.color}, Dangerous = ${this.dangerous}")
    }

/*
Primary Constructor is done in Class declaration, we can define more constructors as well.
Secondary Constructor
prefixed with constructor keyword
must delegate to primary constructor directly or indirectly
delegation is done using keyword 'this'
 */

    // first secondary constructor adding color and delegating primary constructor directly
    constructor(name: String, color: String):this(name){
        this.color=color
        println("First secondary constructor values name = ${this.name}, Color = ${this.color}, Dangerous = ${this.dangerous}")
    }

    // second secondary constructor adding dangerous and delegating to primary constructor indirectly
    // i.e. referring from first secondary constructor

    constructor(name: String, color: String, dangerous: Boolean):this(name,color){
        this.dangerous=dangerous
        println("Second secondary constructor values name = ${this.name}, Color = ${this.color}, Dangerous = ${this.dangerous}")

    }


}


