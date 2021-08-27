import br.com.study.bytebank.model.Cliente
import br.com.study.bytebank.model.ContaCorrente
import br.com.study.bytebank.model.ContaPoupanca
import br.com.study.bytebank.model.Endereco

fun testaClasse() {

    val marcos = Cliente(nome = "Marcos", "", senha = 18, endereco = Endereco(logradouro = "Rua ao lado"))

    val contaMarcos = ContaCorrente(titular = marcos, numeroDaConta = 1000)
    println("Titular da conta: ${contaMarcos.titular.nome}")
    println("Número da conta: ${contaMarcos.numeroDaConta}")
    println("Saldo da conta: ${contaMarcos.saldoDaConta}")
    println("Endereço: ${contaMarcos.titular.endereco.logradouro}\n")

    val angie = Cliente(nome = "Angie", "", senha = 1)

    val contaAngie = ContaPoupanca(numeroDaConta = 2000, titular = angie)
    println("Titular da conta: ${contaAngie.titular.nome}")
    println("Número da conta: ${contaAngie.numeroDaConta}")
    println("Saldo da conta: ${contaAngie.saldoDaConta}\n")

    contaMarcos.deposita(50)
    contaAngie.deposita(100)
    contaMarcos.sacar(10)
    contaAngie.sacar(50)
    contaAngie.transferir(valor = 20, destino = contaMarcos, 1)

    println("Saldo total do titular ${contaMarcos.titular.nome}: ${contaMarcos.saldoDaConta}\n")
    println("Saldo total da titular ${contaAngie.titular.nome}: ${contaAngie.saldoDaConta}\n")
}