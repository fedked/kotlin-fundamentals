package fundamentos

class Pessoa(var nome: String, var idade: Int) { // os atributos no parenteses são informações da classe Pessoa
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}"
    }
} // construtor

fun main() {
    var fernando = Pessoa("Fernando", 28) // essa variável se torna novo objeto de tipo pessoa
    println(fernando)
}