package br.com.study.bytebank

import br.com.study.bytebank.model.Endereco
import java.lang.IllegalStateException

fun testaNullability() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vázio")
        println(tamanhoComplemento)
    }
}