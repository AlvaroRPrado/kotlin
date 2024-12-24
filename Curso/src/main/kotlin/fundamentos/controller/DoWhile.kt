package fundamentos.controller

fun main() {
    var option: Int = 0
    do {
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $option")
    }while (option != -1)
}