package br.com.study.bytebank.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : Admin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticar {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

}