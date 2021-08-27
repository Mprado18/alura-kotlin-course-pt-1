package br.com.study.bytebank.model

class SistemaInterno {

    fun entrar(admin: Autenticar, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo(a) ao ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }

}