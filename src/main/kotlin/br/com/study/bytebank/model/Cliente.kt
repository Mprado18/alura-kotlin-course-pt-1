package br.com.study.bytebank.model

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    val senha: Int): Autenticar {

    override fun autentica(senha: Int): Boolean {
        return if (this.senha == senha) {
            true
        } else {
            false
        }
    }


}