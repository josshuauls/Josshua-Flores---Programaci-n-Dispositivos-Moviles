// Hecho por Josshua David Flores C.

fun main(){
    // Variable para controlar la ejecución del juego y generación del número aleatorio
    var continuar: Boolean = true
    var numeroAleatorio = (Math.random()*30).toInt() + 1

    // Mensaje de inicio del juego
    println("Adivina el numero entre 1 y 30")

    // Bucle para permitir al jugador adivinar el número
    while(continuar == true){
        println("Ingresa un numero: ")
        var jugador: Int = readln().toInt()

        // Comparación del número ingresado por el jugador con el número aleatorio
        if(jugador == numeroAleatorio){
            continuar = false
            println("Adivinaste, el numero es: " + numeroAleatorio)
        }
        else if(jugador < numeroAleatorio){
            println("El numero es MAYOR")
        }
        else if(jugador > numeroAleatorio){
            println("El numero es MENOR")
        }
    }
}
