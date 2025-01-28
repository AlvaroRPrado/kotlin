package orientacaobjeto.encapsulamento

private val dentroDoArquivo = 1
//protected val protegidoNaoSuportadoAqui = 1
internal  val dentroDoProjeto = 1
public val publico = 1

private fun dentroDoArquivo() = 1
//protected fun protegidoNaoSuportadoAqui() = 1
internal  fun dentroDoProjeto() = 1
public fun publico() = 1

open class Capsula{
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoPjeto = 1
    public val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoPjeto() = 1
    public fun publico() = 1
}

class CapsulaFilha : Capsula(){
    fun verificarAcesso(){
        //println(dentrodoObjeto)// Não vai pois o objeto e privado
        //println(Capsula().vaiPorHeranca)//Forma errada de chamada
        println(vaiPorHeranca)
        println(dentroDoPjeto)
        println(publico)
    }
}
fun verificarAcesso(){
   // println(Capsula.dentrodoObjeto())
   // println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoPjeto())
    println(Capsula().publico())
}
fun main() {
    println(CapsulaFilha().publico)
}
