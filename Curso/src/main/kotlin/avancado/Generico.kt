package avancado

class Caixa<T>(val objeto: T){
    private val objetos = ArrayList<T>()
    init {
        adicionar(objeto)
    }
    fun adicionar(novoObjeto: T){
        objetos.add(novoObjeto)
    }
    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar = Caixa("Caneta")
    materialEscolar.adicionar("Lapís")
    materialEscolar.adicionar("Borracha")
    materialEscolar.adicionar(novoObjeto = "Caderno")
    println(materialEscolar)

    val numero = Caixa(objeto = 1)
    numero.adicionar(2)
    println(numero)
}