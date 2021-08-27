package br.com.study.bytebank.model

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : Admin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticar {

    override fun bonificacao(): Double {
        return salario * 0.3 + plr
    }

}