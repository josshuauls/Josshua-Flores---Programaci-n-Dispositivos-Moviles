//Autor: Josshua David Flores Chumbimuni
//Fecha Creación: 26/03/2024
//Fecha Modificación: 27/03/2024
fun main(){
    println("Creacion de producto")
    var MiProducto1 = Producto(10.0,10.0)
    var MiProducto2 = Producto()
    MiProducto1.setPrecio(1000.0)
    MiProducto1.setDescuento(99.0)
    MiProducto1.calcularPrecio()
}

class Producto{
    private var precio: Double
    private var descuento: Double
    constructor(){
        precio = 0.0
        descuento = 0.0
    }
    constructor(precio: Double,descuento: Double){
        this.precio = precio
        this.descuento = descuento
    }
    fun setPrecio(precio: Double){
        this.precio = precio
        println("El precio del producto ahora es: $precio")
    }

    fun setDescuento(descuento: Double){
        if(descuento <= 100.0){
            this.descuento = descuento
            println("El descuento del producto ahora es: $descuento%")
        }
        else{
            println("El descuento no puede ser mayor a 100.0%")
        }
    }

    fun calcularPrecio(){
         var precioFinal: Double = precio - ((descuento/100) * precio)
        println("El precio final es de: $precioFinal")
    }
}