package fundamentos.controller

fun main() {
    for (i in 1..10){
        if (i == 5){
            continue
        }
        println("Valor atual: $i")
    }
}