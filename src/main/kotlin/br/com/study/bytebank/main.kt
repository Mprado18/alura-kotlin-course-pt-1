import br.com.study.bytebank.functionsTests.funcao1
import br.com.study.bytebank.functionsTests.testaAny
import br.com.study.bytebank.functionsTests.testaExpressao
import br.com.study.bytebank.model.Conta
import br.com.study.bytebank.testaNullability

fun main() {

    println("IMPRESSÕES USANDO PARADIGMA PRECEDURAL\n")
    val titular = "Marcos"
    println("Bem vindo ao bytebank $titular")

    val saldo: Double = soma()
    testaCondicoes(saldo)

    println("\nIMPRESSÕES USANDO CLASSE CONTA\n")
    testaClasse()

    println("IMPRESSÕES USANDO CLASSE FUNCIONÁRIO\n")
    testaFuncionarios()

    println("\nIMPRESSÕES USANDO CLASSE CONTA CORRENTE\n")
    val contaCorrente = testaContaCorrente()

    println("\nIMPRESSÕES USANDO CLASSE CONTA POUPANÇA\n")
    testaContaPoupanca(contaCorrente)

    println("\nIMPRESSÕES USANDO CLASSE CLIENTE E INTERFACE AUTENTICAÇÃO\n")
    testaClienteEAutenticacao()

    println("\nTotal de contas: ${Conta.total}")

    println("\nIMPRESSÕES USANDO O TESTA ANY\n")
    testaAny()

    println("\nIMPRESSÕES DO TESTE DE PILHA DE EXECUÇÃO\n")
    println("inicio main")
    funcao1()
    println("fim main")

    println("\nIMPRESSÕES DO TESTE DE EXPRESSÃO\n")
    testaExpressao()

    println("\nIMPRESSÕES DO TESTE DE NULLABILITY\n")
    testaNullability()

}









