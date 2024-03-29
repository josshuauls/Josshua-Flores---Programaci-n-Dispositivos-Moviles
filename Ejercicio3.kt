//Autor: Josshua David Flores Chumbimuni
//Fecha Creación: 29/03/2024
//Fecha Modificación: 29/03/2024

// Clase abstracta Empleado
abstract class Empleado(
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val salario: Double
) {
    // Método abstracto para calcular el pago
    abstract fun calcularPago(): Double
}

// Subclase EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto(
    nombre: String,
    apellido: String,
    edad: Int,
    salario: Double,
    val horasTrabajadas: Int,
    val tarifaHora: Double
) : Empleado(nombre, apellido, edad, salario) {

    // Método para calcular el pago para un empleado a tiempo completo
    override fun calcularPago(): Double {
        return horasTrabajadas * tarifaHora
    }
}

// Subclase EmpleadoMedioTiempo
class EmpleadoMedioTiempo(
    nombre: String,
    apellido: String,
    edad: Int,
    salario: Double,
    val horasTrabajadas: Int,
    val tarifaHora: Double,
    val diasTrabajados: Int
) : Empleado(nombre, apellido, edad, salario) {

    // Método para calcular el pago para un empleado a medio tiempo
    override fun calcularPago(): Double {
        return horasTrabajadas * tarifaHora * diasTrabajados
    }
}

fun main() {
    // Crear instancias de las subclases
    val empleadoTiempoCompleto = EmpleadoTiempoCompleto("Juan", "Perez", 30, 0.0, 40, 10.0)
    val empleadoMedioTiempo = EmpleadoMedioTiempo("Maria", "Gonzalez", 25, 0.0, 20, 8.0, 5)

    // Calcular el pago para cada empleado
    val pagoEmpleadoTiempoCompleto = empleadoTiempoCompleto.calcularPago()
    val pagoEmpleadoMedioTiempo = empleadoMedioTiempo.calcularPago()

    // Imprimir los pagos
    println("El pago para el empleado a tiempo completo es: $pagoEmpleadoTiempoCompleto")
    println("El pago para el empleado a medio tiempo es: $pagoEmpleadoMedioTiempo")
}
