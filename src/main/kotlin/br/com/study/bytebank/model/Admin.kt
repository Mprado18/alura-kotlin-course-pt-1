package br.com.study.bytebank.model

abstract class Admin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    open fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}