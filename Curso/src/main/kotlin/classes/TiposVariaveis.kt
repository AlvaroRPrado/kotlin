package classes

const val diretamenteNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}
class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }
    fun fazer() {
        val local: Int = 7
        if (local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local, $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)

}