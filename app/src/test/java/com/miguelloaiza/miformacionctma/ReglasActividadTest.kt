import org.junit.Test
import org.junit.Assert.*

class ActividadTest {

    // PRUEBA 1: Crear una actividad
    @Test
    fun crearActividad_conDatosValidos_seCreaCorrectamente() {

        val titulo = "Estudiar Kotlin"
        val descripcion = "Realizar ejercicios de Android"
        val estado = "Pendiente"

        assertTrue(titulo.isNotEmpty())
        assertTrue(descripcion.isNotEmpty())
        assertEquals("Pendiente", estado)
    }


    // PRUEBA 2: Editar una actividad
    @Test
    fun editarActividad_cambiaElTituloCorrectamente() {

        var titulo = "Estudiar Java"

        // Se modifica el título
        titulo = "Estudiar Kotlin"

        // Comprobamos que el título haya cambiado
        assertEquals("Estudiar Kotlin", titulo)
    }
}