//Autor: Josshua David Flores Chumbimuni
//Fecha Creación: 29/03/2024
//Fecha Modificación: 29/03/2024

// Interfaz para vehículos alquilables
interface VehiculoAlquilable {
    fun alquilar()
    fun devolver()
}

// Clase concreta Coche que implementa la interfaz VehiculoAlquilable
class Coche : VehiculoAlquilable {
    var alquilado: Boolean = false

    override fun alquilar() {
        if (!alquilado) {
            println("El coche ha sido alquilado.")
            alquilado = true
        } else {
            println("El coche ya está alquilado.")
        }
    }

    override fun devolver() {
        if (alquilado) {
            println("El coche ha sido devuelto.")
            alquilado = false
        } else {
            println("El coche ya ha sido devuelto o nunca fue alquilado.")
        }
    }
}

// Clase concreta Moto que implementa la interfaz VehiculoAlquilable
class Moto : VehiculoAlquilable {
    var alquilado: Boolean = false

    override fun alquilar() {
        if (!alquilado) {
            println("La moto ha sido alquilada.")
            alquilado = true
        } else {
            println("La moto ya está alquilada.")
        }
    }

    override fun devolver() {
        if (alquilado) {
            println("La moto ha sido devuelta.")
            alquilado = false
        } else {
            println("La moto ya ha sido devuelta o nunca fue alquilada.")
        }
    }
}

fun main() {
    // Crear instancias de Coche y Moto
    val coche = Coche()
    val moto = Moto()

    // Alquilar y devolver el coche
    coche.alquilar()
    coche.alquilar()
    coche.devolver()
    coche.devolver()

    println()

    // Alquilar y devolver la moto
    moto.alquilar()
    moto.alquilar()
    moto.devolver()
    moto.devolver()
}
