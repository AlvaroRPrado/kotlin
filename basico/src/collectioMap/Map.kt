package collectioMap

fun main() {
    val map = hashMapOf("chave1" to 1, "chave2" to 2, "chave3" to 3)
    map.put("chave4", 4)
    map.remove("chave2")


    for (chave in  map.keys){
        println("$chave: ${map.get(chave)}")
    }
}