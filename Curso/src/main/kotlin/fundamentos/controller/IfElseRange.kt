package fundamentos.controller

val nota: Double = 9.3
fun main() {
    //Usando o operador range
    if (nota in 9.0..10.0){
        println("Fantastico")
    }else if (nota in 7.0..8.9){
        println("Parabens")
    }else if (nota in 4.0.. 6.9){
        println("Ainda pode recuperar")
    }else if (nota in 0.0..3.9){
        println("Tive vejo no proximo semestre")
    }else{
        println("nota invalida")
    }

}