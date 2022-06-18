package digionebank

class Pessoa(nome:String,cpf:String){
    var Nome:String = nome
    var Cpf:String = cpf

    fun cadastro(){
        "Nome: $Nome, CPF:$Cpf"
    }
}

fun main(){
    var pessoa = Pessoa("Samuel","000.000.000.00")
}