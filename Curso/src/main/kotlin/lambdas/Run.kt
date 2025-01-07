package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereco = "AV Brasil"
        num= 2221
    }
    println(casa)
}