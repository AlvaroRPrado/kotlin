package funcoes

inline fun <T> executandoComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no metodo $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Metodo $nomeFuncao finalizado...")
    }
}
fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val resultado = executandoComLog("somar"){
        somar2(3,5)
    }
    println(resultado)
}