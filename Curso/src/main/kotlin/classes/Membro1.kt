package classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    val nascimento: Data = Data(dia = 31, mes = 12, ano = 2000)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento){ println("${dia}/${mes}/${ano}") }
    nascimento.mes = 3
    println(nascimento.formatar())
}