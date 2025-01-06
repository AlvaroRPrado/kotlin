package classes

class Produto(var name: String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main() {
    val p1 = Produto("Ipad", 2349.90, 0.50, ativo = true)
    println(p1.precoComDesconto)

    val p2 = Produto(name = "Galaxy note 7", preco = 2699.49, desconto = 0.50, false)
    println("${p2.name}\n\tDe:R$ ${p2.preco}\n\tPor: R$ ${p2.precoComDesconto}")
    if (p2.inativo){
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoComDesconto}")
    }
}