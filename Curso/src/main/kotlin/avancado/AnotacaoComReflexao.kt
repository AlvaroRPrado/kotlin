package avancado

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, name: String){
    @Positivo
    var id: Int = id

    @NaoVazio
    var name: String = name
}
//Reflection
fun getValor(objeto: Any, nomeDoAtributo: String): Any {
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo)
    val estaAcessivel = atributo.isAccessible

    atributo.isAccessible = true
    val valor = atributo.get(objeto)
    atributo.isAccessible = estaAcessivel

    return valor
}
fun validar(objeto: Any): List<String>{
    val msgs = ArrayList<String>()
    objeto::class.members.forEach{ member ->
        member.annotations.forEach { annotation ->
            val valor = getValor(objeto, member.name)
            when(annotation){
                is Positivo ->
                    if (valor !is Int || valor <= 0){
                        msgs.add("Valor '$valor' não é um número positivo")
                    }else{
                        msgs.add("$valor")
                    }
                is NaoVazio ->
                    if (valor !is String || valor.trim().isEmpty()){
                        msgs.add("Valor '$valor' não e uma string valida")
                    }else{
                        msgs.add("$valor")
                    }
            }
        }

    }
    return msgs
}
fun main() {
    val obj1 = Pessoa(1,"Chico")
    val obj3 = Pessoa(-8,"")
    println(validar(obj1))
    println(validar(obj3))

    val obj2 = Pessoa(2,"Maria")
    val obj4 = Pessoa(-2,"  ")
    println(validar(obj2))
    println(validar(obj4))

}