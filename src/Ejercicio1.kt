// Hecho por Josshua David Flores C.

// Función principal
fun main(){
    // Mensajes de bienvenida y solicitudes de entrada de datos
    println("Bienvenido al Sistema de Salarios Empresarial:");
    println("Ingresa el salario: ");
    var salario: Float = readln().toFloat();
    println("Ingresa la puntuacion: ");
    var puntuacion: Float = readln().toFloat();

    // Impresión de los datos ingresados por el usuario
    println("El salario es: " + salario);
    println("La puntuacion es: " + puntuacion);

    // Cálculo del dinero recibido y su impresión
    println("El dinero recibido es: " + (salario*(puntuacion/10)));

    // Cálculo del nivel de rendimiento y su impresión
    println("El rendimiento es: " + NivelRendimiento(puntuacion))
}

// Función para calcular el nivel de rendimiento
fun NivelRendimiento(puntuacion: Float): String{
    // Evaluación de la puntuación para determinar el nivel de rendimiento
    return when(puntuacion){
        in 0.0f..3.0f -> "Inaceptable"
        in 4.0f..6.0f -> "Aceptable"
        in 7.0f..10.0f -> "Merito"
        else -> "Fuera de Rango" // Manejo de casos fuera del rango especificado
    }
}
