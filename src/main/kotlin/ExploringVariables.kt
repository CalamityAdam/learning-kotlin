package main.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

// no literals
// Int not Integer
// var/val can't be used until assigned
// smart casting
// cast with "as" keyword

fun main() {
//    main.kotlin.strings()
    numbers()
}

fun strings() {
//    var is "variable", can be changed - mutable
//    type is inferred. Kotlin is strongly typed (every variable has a type)
    var name = "Adam adam adam"
//    val cannot be changed - immutable
    val surname = "Sisk"

    name = "Adam"

    println("Hello $name ${surname.uppercase()}")
    println("The \$name variable has ${name.length} characters")
    println("Your product costs $10")

    val story = """It was a dark and stormy night.
        |A foul smell crept across the city.
        |Jane wondered what time it was, and when it would be daylight.""".trimMargin("|")

    println(story)

    val changedStory = story.replaceAfterLast("it", " would be dawn.")

    println(changedStory)
    println(name.reversed().lowercase().endsWith("a"))
    println()
}

fun numbers() {
    val myDouble = 21.4

    println("is myDouble a Double? ${myDouble is Double}")
//    this is using reflection (`::class`) - Kotlin has no `.class` as there is in Java
    println("myDouble is a ${myDouble::class.qualifiedName}")
    println("myDouble's javaClass is ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}")
    println("myInteger's javaClass is ${myInteger.javaClass}")

//    note: the type is `Int` instead of `Integer`
    val anotherInteger: Int = 17
//    float includes `f` after the number
    val myFloat = 13.6f
//    long includes `L` after the number
    val myLong = 12L

    val result = myFloat + anotherInteger
    println(result)

//    BigDecimal
    val bd = BigDecimal(17)

//    defining a value but not initializing it (no `=`) (not null, just not initialized)
    val bd2: BigDecimal
//    could not reference `bd2` for anything other than initialization now?
//    println(bd2.abs())

    println("hello")

//    initializing `bd2`
    bd2 = bd.add(BigDecimal(30))
}

