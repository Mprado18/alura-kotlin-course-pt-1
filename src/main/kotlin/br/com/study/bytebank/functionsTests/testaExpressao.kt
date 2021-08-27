package br.com.study.bytebank.functionsTests

fun testaExpressao() {
    val entrada: String = "1,9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("problema na converção")
        null
    }

    if (valor != null) {
        println("valor convertido: $valor")
    } else {
        println("valor inválido")
    }
}