package fundamentos

fun main() {
    val valor: Any = 345

    if (valor is String){
        println(valor)
    }else if (valor !is String){
        println("Não é uma string")
    }
}