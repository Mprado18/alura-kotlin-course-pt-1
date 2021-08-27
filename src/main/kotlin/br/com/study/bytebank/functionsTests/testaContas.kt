import br.com.study.bytebank.model.Cliente
import br.com.study.bytebank.model.ContaCorrente
import br.com.study.bytebank.model.ContaPoupanca

fun testaContaCorrente(): ContaCorrente {

    val marcos = Cliente(nome = "Marcos", cpf = "", senha = 18)

    val contaCorrente = ContaCorrente(titular = marcos, numeroDaConta = 1000)
    contaCorrente.deposita(1000)
    contaCorrente.sacar(100)

    println("Saldo conta corrente: ${contaCorrente.saldoDaConta}")
    return contaCorrente
}

fun testaContaPoupanca(contaCorrente: ContaCorrente) {

    val angie = Cliente(nome = "Angie", cpf = "", senha = 1)

    val contaPoupanca = ContaPoupanca(titular = angie, numeroDaConta = 1002)
    contaPoupanca.deposita(1000)
    contaPoupanca.sacar(100)

    contaCorrente.transferir(100, contaPoupanca, 18)

    println("Saldo conta poupança: ${contaPoupanca.saldoDaConta}")
}