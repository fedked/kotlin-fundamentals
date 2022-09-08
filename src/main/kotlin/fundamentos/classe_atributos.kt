package fundamentos

// A classe criada chamada "Carro" e os dois atributos dentro de parenteses = informações
// Criar o variavel dono para chamar outra classe e coloca o nome de tipo pronto: Dono
class Carro(var cor: String, anoFabricacao: Int, val dono: Dono, val modelo: Modelo)
data class Dono(var nome: String, var idade: Int )
data class Modelo(var nome: String)

fun main() {
    var carro = Carro("Branco", 2021, Dono("Fernando", 28,), Modelo("FIAT"))
    // Para acessar a informação/variável/atributo dentro da classe, é necessário colocar o val pro 'cor'
    // para permitir que pega essa variável cor

    //    println(carro.cor)
    carro.cor = "Preto" // pode alterar qualquer valor com  o variável 'var' MUTÁVEL

    println(carro.cor)
    println("--------------------")

    println(carro.dono)

    println("--------------------")
    // caso quer acessar informação de outra classe Dono,
    // é necessário usar data antes de inicio class
    println(carro.dono.nome)

    carro.dono.nome = "Tails"
    println(carro.dono)

    println(carro.modelo)
}