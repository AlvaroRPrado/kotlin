package funcoes

fun <E>filtrar(list: List<E>, filtro: (E) -> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()
    for (e in list) {
        if (filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}
fun comTresLetras(name: String): Boolean {
    return name.length == 3
}
fun main() {
    val nomes = listOf("Ana", "Aldo", "Bia","Gui", "Alvaro", "Jul" )
    println(filtrar(nomes, ::comTresLetras))
}