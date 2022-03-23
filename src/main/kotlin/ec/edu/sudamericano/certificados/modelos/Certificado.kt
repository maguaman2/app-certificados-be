package ec.edu.sudamericano.certificados.modelos
import javax.persistence.*

@Entity
@Table(name = "certificado")
class Certificado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var cedula: String? = null
    var nombres: String? = null
    var email: String? = null
    var fechas: String? = null
    var rol: String? = null
    var capacitador: String? = null
    var codigo: String? = null
    var area: String? = null
    var curso: String? = null
    var objetivo: String? = null
    var contenidos: String? = null



}