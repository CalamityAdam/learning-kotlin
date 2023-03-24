package com.example.learningkotlin

// primary constructor
class Customer(
    val name: String,
    val address: String,
    var age: Int,
) {
    // secondary constructor for non-required params, calls primary constructor using `this()`
    // this would be used if only `name` and `age` were passed
    constructor(name: String, age: Int) : this(name, "", age) {
        // this block isn't necessary
        println("secondary constructor")
    }

    // will run anytime primary constructor is run
    init {
        println("init block")
    }
}

class AlternativeCustomer(
    val name: String,
    var age: Int,
) {
    // can be initialized either inline with default value or inside `init` block
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

// the cleanest example!!
// NOTE: optional params should be placed last in the list, but this is for the sake of an example
class AnotherAlternativeCustomer(
    val name: String,
    val address: String = "",
    var age: Int,
)

fun main() {
    val customer = Customer("Adam", "123 main st", 32)
    customer.age = 33

    val customer2 = Customer("john", 20)
    val customer3 = AlternativeCustomer("Froderick", 54)
    val customer4 = AlternativeCustomer("johnny", "123 poop st", 32)
    val customer5 = AnotherAlternativeCustomer("Adam", "123 main st", 32)
    val customer6 = AnotherAlternativeCustomer(name = "Adam", age = 32)

    println("${customer.name} is ${customer.age} years old")
    println("${customer2.name} is ${customer2.age} years old")
}
