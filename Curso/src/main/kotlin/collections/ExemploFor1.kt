package collections

fun main() {
    val alunos = arrayListOf<String>("Amanda", "André", "Maria", "Joana")

    for (aluno in alunos){
        println(aluno)
    }
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice} - ${aluno}")
    }
}