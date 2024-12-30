package funcoes

inline fun trasacao(funcao: () -> Unit){
    println("Abrindo transação...")
    try {
        funcao()
    }finally {
        println("Fechando a transação")
    }
}

fun main() {
    trasacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}