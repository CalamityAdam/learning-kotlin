import java.util.Random

fun main() {
//    explicitly typed can't be `null`
//    var name: String = null

//    nullable string
    var name: String? = null

//    name = "adam"

//    null safe operator `?.`
    println(name?.uppercase())

//    non-null assertion (generally speaking, don't use this)
//    this means "this value will _never_ be null, go ahead and run the method)
//    println(name!!.uppercase())

//    `Nothing` type, can never have a value
    var address = null

//    can be reassigned to null
    var myInteger: Int? = 7

    myInteger = null
}