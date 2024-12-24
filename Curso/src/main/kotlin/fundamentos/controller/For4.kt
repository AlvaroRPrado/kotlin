package fundamentos.controller

fun main() {
    val alunos = arrayListOf("Carla", "Maria", "Prado")

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}