package fundamentos

fun main() {
    dizOi(retornaNone(), 28)
    dizOi(idade = 28, nome = "Fernando")
    dizOi("Fulano")
}

fun retornaNone(): String {
    return "Fernnado"
}

fun dizOi(nome: String, idade: Int = 21) {
    println("Oi ${nome}, parabéns pelos seus idade ${idade} anos")
}