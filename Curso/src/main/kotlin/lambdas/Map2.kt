package lambdas

class Produto(val name: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichário escola", 21.90),
    Produto("Lápis de cor", 11.90),
    Produto("Borracha bicolor", 0.70),
    Produto("Apontador com deposito", 1.80)
)
fun main() {
    val totalizar = { total: Double, atual: Double -> total + atual}
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço medio é ${precoTotal / materialEscolar.size}.")
}