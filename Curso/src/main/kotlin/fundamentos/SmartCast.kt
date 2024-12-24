package fundamentos

import java.util.*

fun souEsperto(x: Any){
    if (x is String){
        println(println(x.uppercase(Locale.getDefault())))
    } else if (x is Int){
        println(x.plus(3))
    }
}
fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(4))
        else -> println("Repense sua vida!")
    }
}
fun main() {
    println(souEsperto("oi priscila"))
    println(souEsperto(34))
    println(souEsperto2(23))
    println(souEsperto2("eita"))
    println(souEsperto2(true))

}