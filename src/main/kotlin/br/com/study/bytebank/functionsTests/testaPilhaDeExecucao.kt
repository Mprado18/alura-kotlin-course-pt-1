package br.com.study.bytebank.functionsTests

import br.com.study.bytebank.model.Endereco

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    try {
        for (i in 1..5) {
            println(i)
            //cria exception para teste
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println(e.message)
        println(e.stackTrace)
        //e.printStackTrace() //reune todas informações do message, stacktrace e cause
        println(e.cause)
        println("Capturou exception")
    }

    println("fim funcao2")
}
