package fundamentos

// when = quando(MAIS OU MENOS)
fun main() {

//    val x = 18
//
//    when(x) {
//        5, -5 -> println("5")
//        8 -> println("8")
//        10 -> {
//            println("x == 10")
//            println("X é uma dezena")
//        }
//        in 11..15 -> println("X está entre 11 e 15")
//        !in 16..20 -> println("número não está no range de 16 a 20")
//        else -> println("Numero não mapeado")
//    }

//    println(comecaComOi("oi"))
    when {
        comecaComOi(5) -> println("5")
//        comecaComOi("oi, tudo bem?") -> println("oi, tudo bem?")
        comecaComOi("oi, estou bem!") -> println("oi, estou bem!")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}