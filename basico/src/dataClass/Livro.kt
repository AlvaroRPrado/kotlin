package dataClass

class Livro (val titulo: String, val autor: String, val ano: Int){
    override fun toString(): String {
        return "Livro[titulo = $titulo]"
    }
}


data class DataLivro (val titulo: String, val autor: String, val ano: Int)


fun main() {

    val  livro = Livro("Mente liberta", "Alvaro",  2020)
    val  livro2 = Livro("Mente liberta", "Alvaro",  2020)

    val  dataLivro = DataLivro("Mente liberta", "Alvaro",  2020)
    val  dataLivro2 = DataLivro("Mente liberta", "Alvaro",  2020)


    println(livro)
    println(dataLivro)

    println("Livro são iguais" + livro.equals(livro2))

    println("Livro data são iguais "+ dataLivro.equals(dataLivro2))


}