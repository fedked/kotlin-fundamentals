import java.time.LocalDateTime


fun main() {
    val anoNasc = readLine()!!.toInt()
    val anoAtual = LocalDateTime.now().year

    var idade = anoAtual - anoNasc

    println("Meu nome é $idade")
}