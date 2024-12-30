package funcoes

class Operacoes{
    fun somar(a: Int, b: Int): Int{
        return a + b
    }
}
fun somar(a: Int, b: Int): Int{
    return a + b
}

fun calculo(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}
fun main() {
    println(calculo(2, 3, Operacoes()::somar))
    println(calculo(2, 3, ::somar))
}