import br.com.study.bytebank.model.Cliente
import br.com.study.bytebank.model.SistemaInterno

fun testaClienteEAutenticacao() {

    val cliente = Cliente(nome = "Cliente", cpf = "111.222.333-44", senha = 555)

    val sistemaInterno = SistemaInterno()

    println("Cliente: ${cliente.nome} está autenticando")

    sistemaInterno.entrar(cliente, 555)

}