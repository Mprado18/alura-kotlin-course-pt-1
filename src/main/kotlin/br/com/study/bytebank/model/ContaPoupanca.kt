package br.com.study.bytebank.model

class ContaPoupanca(
    titular: Cliente,
    numeroDaConta: Int
) : Conta(
    titular = titular,
    numeroDaConta = numeroDaConta
) {
    override fun sacar(valor: Int) {
        if (saldoDaConta >= valor) {
            saldoDaConta -= valor
            println("Foi sacado $valor na conta do(a) ${titular.nome}, seu novo total é $saldoDaConta\n")
        } else {
            println("Não é possível realizar saques na conta do(a) ${titular.nome} no momento, saldo indisponível\n")
        }
    }


}