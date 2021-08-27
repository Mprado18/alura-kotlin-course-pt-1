package br.com.study.bytebank.model

class ContaCorrente(
    titular: Cliente,
    numeroDaConta: Int
) : Conta(
    titular = titular,
    numeroDaConta = numeroDaConta
) {

    override fun sacar(valor: Int) {
        val valorComTaxa = valor + 13

        if (saldoDaConta >= valorComTaxa) {
            saldoDaConta -= valorComTaxa
            println("Foi sacado $valor na conta do(a) ${titular.nome}, seu novo total é $saldoDaConta\n")
        } else {
            println("Não é possível realizar saques na conta do(a) ${titular.nome} no momento, saldo indisponível\n")
        }
    }

}