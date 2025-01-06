package classes
var desconto: Double = 0.0
class ItemDePedido(val nome: String, var preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
       // @JvmStatic var desconto: Double = 0.0
    }
    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main() {
    val item1 = ItemDePedido.create("TV 50 polegadas", preco = 2989.90)
    val item2 = ItemDePedido(nome = "Liquidificador", preco = 200.0)
   // ItemDePedido.desconto = 0.10
    desconto = 0.10
    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}