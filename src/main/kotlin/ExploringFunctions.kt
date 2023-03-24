package main.kotlin

// functions can exist outside of classes
// top level functions are private by default, and always static
// if private top level function, it can only be accessed **in this file**
private fun printAString(value: String) {
    println(value)
}

// single expression function (implicit return one-liner)
// optional parameters
fun addTwoNumbers(one: Double = 6.2, two: Double = 3.9): Double = one + two

fun printSomeMath(one: Double, two: Double) {
//    params are vals, cannot be reassigned
//    one = 42.1

    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    fun functionWithin(a: String) {
        println(a)
    }

    functionWithin("hello")
}

// ugly verbose java way to define lambda arg
// fun functionTakesALambda(input: String, action: java.util.Function<String, Int>) {
// cleaner kotlin way 😍
fun functionTakesALambda(input: String, action: (String) -> Int) {
    println(action(input))
}

// "main" function can not be private, although when I tried it, it worked so 🤷‍
fun main() {
    printAString("Hello, world!")
    println(addTwoNumbers(17.3, 9.6))
//    optional params are helpful with named params
    println(addTwoNumbers(two = 5.6))
//    named parameters (order doesn't matter anymore)
    println(printSomeMath(two = 17.3, one = 9.6))

    functionTakesALambda(input = "gooday", action = { it.length })
}
