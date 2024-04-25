//Creación de una cuenta bancaria con POO
//Autor: Josshua David Flores Chumbimuni
//Fecha Creación: 26/03/2024
//Fecha Modificación: 26/03/2024

fun main(){
    println("POO BANCO")
    var MiCuenta = CuentaBancaria(1000.0,500.0)
    //Usando Metodo de la clase para cambiar saldo disponible
    MiCuenta.setSaldo(100.0)
    println("El saldo disponible es de: "+MiCuenta.getSaldo())
    //Usando Metodo de la clase para realizar retiro
    MiCuenta.realizarRetiros(101.0)

}

class CuentaBancaria(private var saldo: Double,private var limite: Double){
    //Metodos
    fun setSaldo(saldo: Double){
        this.saldo = saldo
    }

    fun getSaldo(): Double{
        return saldo
    }

    fun realizarRetiros(retiro: Double){
        if(retiro <= limite && saldo >= retiro){
            saldo = saldo - retiro
            println("El retiro es de:" + retiro)
            println("El saldo disponible es de: " + saldo)
        }
        else{
            println("La operacion no procede")
        }
    }
}