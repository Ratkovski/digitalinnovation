package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")


    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)


    //fazer a uniao
    println("****resultado de uniao***")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("****resultado de subtracao***")
    val funcionarios3 = setOf(joao,pedro,maria)
    val resultSubtracao = funcionarios3.subtract(funcionarios2)
    resultSubtracao.forEach { println(it) }

    println("****resultado de intersect***")
    val funcionarios4 = setOf(joao,pedro,maria)
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}
//exemplos
/*
val funcionarios = listOf(joao, pedro, maria)

 funcionarios.forEach {
     println(it)
 }
     //println("*************************")
    // println(funcionarios.find { it.nome as "maria" })

 println("********************")
 funcionarios
     .sortedBy { it.salario }
     .forEach { println(it) }




println("*********imprima tipo contratacao***********")
funcionarios
.groupBy { it.tipoContratacao }
.forEach { println(it) }

}

*/