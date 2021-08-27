package br.com.study.bytebank.model

import br.com.study.bytebank.exceptions.FalhaAutenticacaoException
import br.com.study.bytebank.exceptions.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numeroDaConta: Int,
    var saldoDaConta: Int = 0
) : Autenticar {
    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    fun deposita(valor: Int) {
        saldoDaConta += valor
        println("Foi depositado $valor na conta do(a) ${titular.nome}, seu novo total é $saldoDaConta\n")
    }

    abstract fun sacar(valor: Int)

    fun transferir(valor: Int, destino: Conta, senha: Int) {
        if (saldoDaConta < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O Saldo é insuficiente, saldo atual: $saldoDaConta, valor a ser transferido: $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldoDaConta -= valor
        destino.saldoDaConta += valor
        println("O(A) ${titular.nome} transferiu o valor de $valor para a conta do(a) titular ${destino.titular.nome}\n")
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}