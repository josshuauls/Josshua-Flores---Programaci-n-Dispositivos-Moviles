//Autor: Josshua David Flores Chumbimuni
//Fecha Creación: 29/03/2024
//Fecha Modificación: 29/03/2024

//Importando libreria matematica
import kotlin.math.PI

// Clase abstracta Shape
abstract class Shape {
    abstract val area: Double
    abstract val perimeter: Double

    abstract fun calculateArea()
    abstract fun calculatePerimeter()

    fun printArea() {
        println("Área: $area")
    }

    fun printPerimeter() {
        println("Perímetro: $perimeter")
    }
}

// Subclase Cuadrado
class Square(val side: Double) : Shape() {
    override var area: Double = 0.0
    override var perimeter: Double = 0.0

    init {
        calculateArea()
        calculatePerimeter()
    }

    override fun calculateArea() {
        area = side * side
    }

    override fun calculatePerimeter() {
        perimeter = 4 * side
    }
}

// Subclase Círculo
class Circle(val radius: Double) : Shape() {
    override var area: Double = 0.0
    override var perimeter: Double = 0.0

    init {
        calculateArea()
        calculatePerimeter()
    }

    override fun calculateArea() {
        area = PI * radius * radius
    }

    override fun calculatePerimeter() {
        perimeter = 2 * PI * radius
    }
}

// Subclase Rectángulo
class Rectangle(val length: Double, val width: Double) : Shape() {
    override var area: Double = 0.0
    override var perimeter: Double = 0.0

    init {
        calculateArea()
        calculatePerimeter()
    }

    override fun calculateArea() {
        area = length * width
    }

    override fun calculatePerimeter() {
        perimeter = 2 * (length + width)
    }
}

fun main() {
    // Crear instancias de las subclases
    val square = Square(5.0)
    val circle = Circle(3.0)
    val rectangle = Rectangle(4.0, 6.0)

    // Imprimir resultados de área y perímetro para cada instancia
    println("Cuadrado:")
    square.printArea()
    square.printPerimeter()

    println("\nCírculo:")
    circle.printArea()
    circle.printPerimeter()

    println("\nRectángulo:")
    rectangle.printArea()
    rectangle.printPerimeter()
}
