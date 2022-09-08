package fundamentos

fun main() {
    var pessoa: Pessoa? = Pessoa("Fernando", 28)
    println(pessoa!!.nome)
}