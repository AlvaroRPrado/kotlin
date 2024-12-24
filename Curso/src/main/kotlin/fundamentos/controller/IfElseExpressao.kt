package fundamentos.controller

fun main() {
    val num: Int = 55
    val num2: Int = 344

    val valorMaior: Int = if (num > num2){
        println("Processando if...")
        num
    }else{
        println("Processando else...")
        num2
    }
    println(valorMaior)
println()
    val valorMenor: Int = if (num < num2) num else num2
    println(valorMenor)
}