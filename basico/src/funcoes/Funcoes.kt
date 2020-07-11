package funcoes

import java.util.*

fun main(args: Array<String>) {

    println(soma(32, 43))
   println(queHoraSao())

    olaMundo()

    var total = soma(59, 54)
    println("Total: $total")
}

fun soma(a: Int, b: Int): Int{
    return  a + b
}
fun queHoraSao(): Date{
    return Date()
}

fun olaMundo(){
    println("ola mundo")
}
