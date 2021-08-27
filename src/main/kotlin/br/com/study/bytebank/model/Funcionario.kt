package br.com.study.bytebank.model

abstract class Funcionario(
    var nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract fun bonificacao(): Double
}