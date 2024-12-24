package fundamentos.controller

fun main() {
    val notaa = 6
    when(notaa){
        in 9..10 -> println("Fantatisco")
        in 8..7 -> println("Parabens")
        6,5,4 -> println("Tem como recuperar ")
        3, 2,0 -> println("Reprovado")
        else -> println("Invalido")
    }
}