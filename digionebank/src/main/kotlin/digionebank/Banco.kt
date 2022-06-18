package digionebank

data class Banco(
    val nome:String,
    val numero:Int
){
    fun exibeNumero(){
        println(this.numero)
    }
}