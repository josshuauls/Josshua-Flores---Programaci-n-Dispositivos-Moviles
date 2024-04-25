//Autor: Josshua David Flores Chumbimuni
//Fecha Creación: 29/03/2024
//Fecha Modificación: 29/03/2024

// Clase abstracta Material
abstract class Material(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int
) {
    abstract fun mostrarDetalles()
}

// Subclase Libro
class Libro(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    val genero: String,
    val numeroPaginas: Int
) : Material(titulo, autor, anioPublicacion) {

    override fun mostrarDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anioPublicacion")
        println("Género: $genero")
        println("Número de Páginas: $numeroPaginas")
    }
}

// Subclase Revista
class Revista(
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    val issn: String,
    val volumen: Int,
    val numero: Int,
    val editorial: String
) : Material(titulo, autor, anioPublicacion) {

    override fun mostrarDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anioPublicacion")
        println("ISSN: $issn")
        println("Volumen: $volumen")
        println("Número: $numero")
        println("Editorial: $editorial")
    }
}

// Clase Usuario
class Usuario(
    val nombre: String,
    val apellido: String,
    val edad: Int
) {
    fun reservarMaterial(material: Material) {
        println("El usuario $nombre $apellido ha reservado el material ${material.titulo}")
    }

    fun devolverMaterial(material: Material) {
        println("El usuario $nombre $apellido ha devuelto el material ${material.titulo}")
    }
}

// Clase Biblioteca
class Biblioteca {
    val materialesDisponibles = mutableListOf<Material>()
    val usuariosRegistrados = mutableListOf<Usuario>()

    fun prestarMaterial(material: Material, usuario: Usuario) {
        if (materialesDisponibles.contains(material)) {
            usuariosRegistrados.add(usuario)
            println("Se ha prestado el material ${material.titulo} al usuario ${usuario.nombre} ${usuario.apellido}")
        } else {
            println("El material ${material.titulo} no está disponible en la biblioteca")
        }
    }

    fun recibirDevolucion(material: Material, usuario: Usuario) {
        if (usuariosRegistrados.contains(usuario)) {
            usuariosRegistrados.remove(usuario)
            println("Se ha recibido la devolución del material ${material.titulo} del usuario ${usuario.nombre} ${usuario.apellido}")
        } else {
            println("El usuario ${usuario.nombre} ${usuario.apellido} no tiene este material prestado")
        }
    }
}

fun main() {
    // Crear instancias de las subclases
    val libro = Libro("La historia sin fin", "Michael Ende", 1979, "Fantasía", 432)
    val revista = Revista("National Geographic", "National Geographic Society", 2023, "9876-5432", 203, 4, "NG")

    // Crear instancia de Usuario
    val usuario = Usuario("Ana", "García", 30)

    // Crear instancia de Biblioteca
    val biblioteca = Biblioteca()

    // Añadir materiales disponibles a la biblioteca
    biblioteca.materialesDisponibles.add(libro)
    biblioteca.materialesDisponibles.add(revista)

    // Realizar operaciones de préstamo y devolución
    biblioteca.prestarMaterial(libro, usuario)
    usuario.reservarMaterial(revista)
    biblioteca.recibirDevolucion(libro, usuario)
    usuario.devolverMaterial(revista)

    // Mostrar detalles de los materiales
    println("\nDetalles del Libro:")
    libro.mostrarDetalles()

    println("\nDetalles de la Revista:")
    revista.mostrarDetalles()
}
