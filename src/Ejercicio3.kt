// Hecho por Josshua David Flores C.

fun main(){
    // Variables para almacenar la edad máxima, mínima y las edades ingresadas
    var edadMaxima: Int = Int.MIN_VALUE
    var edadMinima: Int = Int.MAX_VALUE
    var edades: String = ""

    // Solicitar al usuario la cantidad de alumnos
    println("Ingresa la cantidad de alumnos: ")
    var cantidadAlumnos: Int = readln().toInt()

    // Iterar para ingresar la edad de cada alumno y actualizar las variables correspondientes
    for(i in 1..cantidadAlumnos){
        println("Ingresar la edad del alumno: ")
        var edadAlumno: Int = readln().toInt()
        if(edadAlumno < edadMinima){
            edadMinima = edadAlumno
        }
        if(edadAlumno > edadMaxima){
            edadMaxima = edadAlumno
        }
        edades += "$edadAlumno, "
    }

    // Imprimir la cantidad de alumnos, la edad máxima, la edad mínima y todas las edades ingresadas
    println("Cantidad de alumnos: " + cantidadAlumnos)
    println("Edad Maxima: "+ edadMaxima)
    println("Edad Minima: "+edadMinima)
    println("Edades: "+ edades)
}
