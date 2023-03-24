package main.kotlin

import java.math.BigDecimal
import java.util.Random

fun main() {
//    Kotlin equivalent to Java's `Object`
    var result: Any

    val randomNumber = Random().nextInt(2)

    if (randomNumber == 1) {
        result = BigDecimal(30)
    } else {
      result = "hello"
    }

    println("Result is currently $result")

//    smart casting - type is explicitly checked in `if` statement
//    so `result` type is automatically cast to that type
    if (result is BigDecimal) {
        result = result.add(BigDecimal(47))
    } else {
//        explicit cast, using "as"
        val tempResult = result as String
        result = tempResult.uppercase()
    }

    println("Result is currently $result")
}