package fundamentos.controller

fun main() {
    val nota: Double = 3.0
    val trabalho: Double = 2.0
    val result = nota + trabalho
    if (result >= 8.0){
        println("Aprovado, nota: $result")
    }else{
        println("Reprovado, nota: $result")
    }

}