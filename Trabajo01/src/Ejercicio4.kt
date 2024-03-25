// Hecho por Josshua David Flores C.

fun main(){
    // Menú de opciones
    println("===Menu===")
    println("1. Suma\n2. Resta\n3. Multiplicación\n4. División")
    println("Ingresa tu opcion: ")
    var opcion: Int = readln().toInt()
    Seleccionar(opcion)
}

// Función para seleccionar la operación correspondiente
fun Seleccionar(numero: Int){
    // Selección de la operación según la opción ingresada por el usuario
    when(numero){
        1 -> Suma()
        2 -> Resta()
        3 -> Multiplicar()
        4 -> Division()
        else -> "Opcion Invalida"
    }
}

// Función para realizar la suma
fun Suma(){
    // Ingreso de los números a sumar y cálculo del resultado
    println("Ingresa el primer número: ")
    var a: Int = readln().toInt()
    println("Ingresa el segundo número:")
    var b: Int = readln().toInt()
    println("El resultado es: "+ (a + b))
}

// Función para realizar la resta
fun Resta(){
    // Ingreso de los números a restar y cálculo del resultado
    println("Ingresa el primer número: ")
    var a: Int = readln().toInt()
    println("Ingresa el segundo número:")
    var b: Int = readln().toInt()
    println("El resultado es: "+ (a - b))
}

// Función para realizar la multiplicación
fun Multiplicar(){
    // Ingreso de los números a multiplicar y cálculo del resultado
    println("Ingresa el primer número: ")
    var a: Int = readln().toInt()
    println("Ingresa el segundo número:")
    var b: Int = readln().toInt()
    println("El resultado es: "+ (a * b))
}

// Función para realizar la división
fun Division(){
    // Ingreso de los números para la división y cálculo del resultado
    println("Ingresa el primer número: ")
    var a: Int = readln().toInt()
    println("Ingresa el segundo número:")
    var b: Int = readln().toInt()
    println("El resultado es: "+ (a / b))
}
