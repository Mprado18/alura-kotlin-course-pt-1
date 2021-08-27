import br.com.study.bytebank.model.*

fun testaFuncionarios() {

    val sistemaInterno = SistemaInterno()

    val marcos = Analista(nome = "Marcos", cpf = "103.480.109.07", salario = 2000.50)
    println("Nome: ${marcos.nome}")
    println("CPF: ${marcos.cpf}")
    println("Salario: ${marcos.salario}")
    println("Bonificação: ${marcos.bonificacao()}")

    val angie = Gerente(nome = "Angie", cpf = "123.456.789.89", salario = 3000.0, 1234)
    println("\nNome: ${angie.nome}")
    println("CPF: ${angie.cpf}")
    println("Salario: ${angie.salario}")
    println("Bonificação: ${angie.bonificacao()}")
    sistemaInterno.entrar(angie, 1324)

    val winky = Diretor(nome = "Winky", cpf = "032.564.879.89", salario = 4500.0, 4312, 200.0)
    println("\nNome: ${winky.nome}")
    println("CPF: ${winky.cpf}")
    println("Salario: ${winky.salario}")
    println("Bonificação: ${winky.bonificacao()}")
    println("PLR: ${winky.plr}")
    sistemaInterno.entrar(winky, 4312)

    val erlete = Analista(nome = "Erlete", cpf = "565.898.787-89", salario = 2800.0)
    println("\nNome: ${erlete.nome}")
    println("CPF: ${erlete.cpf}")
    println("Salario: ${erlete.salario}")
    println("Bonificação: ${erlete.bonificacao()}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(marcos)
    calculadora.registra(angie)
    calculadora.registra(winky)
    calculadora.registra(erlete)

    println("\nTotal de bonificação: ${calculadora.total}")
}