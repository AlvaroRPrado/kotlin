package fundamentos.operadores

fun obterResult(nota: Double) : String = if (nota >= 7.0) "Aprovado" else "Reprovado"

fun main() {
    println(obterResult(4.0))
}
