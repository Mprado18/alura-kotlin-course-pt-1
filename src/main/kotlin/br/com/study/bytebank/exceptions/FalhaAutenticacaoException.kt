package br.com.study.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem) {
}