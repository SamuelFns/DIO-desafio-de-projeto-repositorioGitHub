package digionebank

class Pessoa {
    var name:String? = "Samuel"
    var cpf:String? = "000.000.000-00"
}

fun main(){
    var pessoa = Pessoa()
    println(pessoa.name)
}