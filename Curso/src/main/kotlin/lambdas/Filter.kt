package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val  alunos = arrayListOf(
        Aluno("Alvaro", 9.0),
        Aluno("Priscila", 9.9),
        Aluno("Maria", 3.7),
        Aluno("Pedro", 6.9)
    )
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    val aprovados2 = alunos.filter { it.nota >= 7.0 }.sortedBy { -it.nota }
    val reprovados = alunos.filter { it.nota < 7.0 }.sortedBy { it.nome }
    val reprovados2 = alunos.filter { it.nota < 7.0 }.sortedBy { it.nota }
    println("Alunos Aprovados: $aprovados2")
    println("Alunos Aprovados: $aprovados")
    println()
    println("Alunos reprovados: $reprovados")
    println("Alunos reprovados: $reprovados2")
}