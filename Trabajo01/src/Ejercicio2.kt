// Hecho por Josshua David Flores C.

/*
* 0 = Piedra
* 1 = Papel
* 2 = Tijera
* */
fun main(){
    // Mensaje de inicio del juego
    println("Piedra, Papel o Tijera");
    println("Ingresa tu jugada: ");
    println("0 : Piedra\n1 : Papel\n2 : Tijera\n")

    // Obtención de la jugada del jugador
    var jugador: Int = readln().toInt()
    var computadora: Int =JuegaComputadora()

    // Impresión del resultado del juego y las jugadas realizadas
    println(Comparar(jugador,computadora))
    println(Jugada(jugador)+" Vs "+Jugada(computadora))
}

// Función para que la computadora realice una jugada aleatoria
fun JuegaComputadora(): Int{
    var computadora = (Math.random()*3).toInt()
    return computadora
    //println("El numero es: " + computadora)
}

// Función para comparar las jugadas del jugador y la computadora y determinar el resultado del juego
fun Comparar(jugador: Int, computadora: Int): String{
    if(jugador == computadora){
        return "Empate"
    }
    else if(jugador == 0 && computadora == 2){
        return "Jugador Gana"
    }
    else if(jugador == 1 && computadora == 0){
        return "Jugador Gana"
    }
    else if(jugador == 2 && computadora == 1){
        return "Jugador Gana"
    }
    else{
        return "Computadora Gana"
    }
}

// Función para convertir el número de jugada en su correspondiente representación textual
fun Jugada(jugada: Int):String{
    return when(jugada){
        0 -> "Piedra"
        1 -> "Papel"
        2 -> "Tijera"
        else -> "JUGADA INVALIDA"
    }
}
