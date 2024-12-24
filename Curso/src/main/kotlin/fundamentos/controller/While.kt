package fundamentos.controller

fun main() {
    var option: Int = 0

    while (option != -1){
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $option")
    }
    println("Até a proxima!!")
}