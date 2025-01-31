package model

enum class CampoEvento {ABERTURA, MARCADO, EXPLOSAO, DESMARCADO, REINICIOALIZACAO}

data class Campo(val linha: Int, val coluna: Int){

    private val vizinhos = ArrayList<Campo>()
    private val callbacks = ArrayList<(Campo, CampoEvento) -> Unit>()

    var marcado: Boolean = false
    var aberto: Boolean = false
    var minado: Boolean = false

    //Somente leitura
    val desmarcado: Boolean get() = !marcado
    val fechado: Boolean get() = !aberto
    val seguro: Boolean get() = !minado
    val objetivoAcancado: Boolean get() = seguro && aberto || minado && marcado
    val qtdeVizinhosMinados: Int get() = vizinhos.filter { it.minado }.size
    val vizinhacaSegura: Boolean get() = vizinhos.map { it.seguro }.reduce{ resultado, seguro -> resultado && seguro}

    fun addVizinho(vizinho: Campo){
        vizinhos.add(vizinho)
    }
    fun onEvento(callback: (Campo, CampoEvento) -> Unit){
        callbacks.add(callback)
    }
    fun abrir(){
        if (fechado){
            aberto = true
            if (minado){
                callbacks.forEach { it(this, CampoEvento.EXPLOSAO) }
            } else{
                callbacks.forEach { it(this, CampoEvento.ABERTURA) }
                vizinhos.filter { it.fechado && it.seguro && vizinhacaSegura }.forEach { it.abrir() }
            }
        }
    }
    fun alterarMarcado(){
        if (marcado){
            marcado = !marcado
            val evento = if (marcado) CampoEvento.MARCADO else CampoEvento.DESMARCADO
            callbacks.forEach { it(this, evento) }
        }
    }
    fun minar(){
        minado = true
    }
    fun reiniciar(){
        aberto = false
        minado = false
        marcado = false
        callbacks.forEach { it(this, CampoEvento.REINICIOALIZACAO) }
    }
}
