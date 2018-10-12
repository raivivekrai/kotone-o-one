fun main(args: Array<String>){

    describeHuman("James", 26, 5.9, true)

    describeHuman(age=27, name="Jimmy", smoke = true, height = 5.11)
    describeHuman(name="Jimmy", smoke = true, height = 5.11)
}

fun describeHuman(name: String, age: Int = 25, height: Double, smoke: Boolean){

    println("Name: $name")
    println("Age: $age")
    println("Height: $height")
    println("Smoke: $smoke")
}