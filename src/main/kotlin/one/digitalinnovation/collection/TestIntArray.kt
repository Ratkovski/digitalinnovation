package one.digitalinnovation.collection

fun main(){
    val values = IntArray(5)
    values[0]=1
    values[1]=7
    values[2]=6
    values[3]=5
    values[4]=2

    for (valor in values){
        println(valor)
    }
    println("********************************")
   values.forEach {
        println(it)
   // values.forEach { valor => println(values)

    }
    println("********************************")
    for (valor in values.indices){
        println(values[valor])
    }
    println("do menor para o maior")
    values.sort()
    for (valor in values){
        println(valor)
    }
}
