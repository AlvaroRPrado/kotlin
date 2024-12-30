package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String) : String {
    return "$funcionario e subordinado(a) a $chefe"
}
fun main() {
    println(relacaoDeTrabalho("Alvaro", "Maria"))
    println(relacaoDeTrabalho(funcionario = "Maria", chefe = "Alvaro"))
}