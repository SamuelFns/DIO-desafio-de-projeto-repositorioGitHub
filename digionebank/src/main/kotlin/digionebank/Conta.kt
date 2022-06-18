package digionebank

import java.math.BigDecimal

class Conta(agencia:String,numero:String,saldo:Float){
    val Agencia:String = agencia
    val Numero:String = numero
    var Saldo:Float = saldo

    fun Deposito(valor:Float){
        Saldo+=valor
    }
    fun Saque(valor:Float){
        Saldo-=valor
    }

}


fun main(){
    var novaConta = Conta("Simoes","123456",2000.00F)
    println(novaConta)
}